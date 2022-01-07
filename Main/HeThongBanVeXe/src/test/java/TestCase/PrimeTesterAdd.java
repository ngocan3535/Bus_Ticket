/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;
import com.haoquy.pojo.*;
import com.haoquy.services.Admin.*;
import java.sql.SQLException;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.*;

/**
 *
 * @author HaoQuy
 */
@RunWith(Parameterized.class)
public class PrimeTesterAdd {
     Bus bus = new Bus();
     private boolean expected;
     private Add a;
     private Update u;


     public PrimeTesterAdd(String id,String end,String time,String date, boolean expected) {
            this.bus.setId(id);
            this.bus.setTo(end);
            this.bus.setTime(time);
            this.bus.setDate(date);
            this.expected = expected;
    }
     @Parameterized.Parameters
     public static Collection testData() 
     {
            return Arrays.asList(new Object[][] 
            {
                {"46-CS03","ĐN","15:00","21/2/2021",true}, //      Đúng
                {"46-CS04","ĐN","3:01","9/12/2020",true}, //       Đúng(đổi định dạng giờ)
                {"46-CS05","ĐN","05:15","9/1/2021",true}, //       Đúng(đổi định dạng ngày)
                {"46-cs06","ĐN","15:16","9/12/2020",true},//       Đúng dù chữ ID in thường
                {"46-CS07","đn","3:01","9/12/2020",true},//        Đúng dù điểm đến là chữ thường
                {"46CS03","ĐN","15:16","9/12/2020",false}, //     Sai định dạng ID
                {"46-CS","ĐN","15:16","9/12/2020",false}, //     Sai định dạng ID
                {"AA-CS03","ĐN","15:16","9/12/2020",false},//    Sai định dạng ID
                {"46-5555","ĐN","15:16","9/12/2020",false},//      Sai định dạng ID
                {"CS-5555","ĐN","15:16","9/12/2020",false},//      Sai định dạng ID
                {"CS1111111","ĐN","15:16","9/12/2020",false},//  Sai định dạng ID
                {"46--S03","ĐN","15:11","01/12/2020",false}, //  Sai định dạng ID
                {"46-C-03","ĐN","15:11","01/12/2020",false}, //   Sai định dạng ID
                
                {"46-CS03","abcs","15:16","9/12/2020",false}, //  Sai nơi đến
                
                {"46-CS03","ĐN","25:16","9/12/2020",false},//    Sai giờ khởi hành
                {"46-CS03","ĐN","15:61","28/12/2020",false},//   Sai phút khởi hành
                {"46-CS03","ĐN",":1500","21/2/2021",false}, //    Sai định dạng thời gian
                {"46-CS03","ĐN",":100","21/2/2021",false}, //    Sai định dạng thời gian
                {"46-CS03","ĐN","00 :1","21/2/2021",false}, //    Sai định dạng thời gian
                {"46-CS03","ĐN","1500: ","21/2/2021",false}, //  Sai định dạng thời gian
                {"46-CS03","ĐN","05:5","21/2/2021",false}, //    Sai định dạng thời gian
                {"46-CS03","ĐN","5:5","21/2/2021",false}, //     Sai định dạng thời gian
                {"46-CS03","ĐN","15:1","01/12/2020",false}, //   Sai định dạng thời gian
                {"46-CS03","ĐN","05:05","21/2/2021",false}, //    Sai định dạng thời gian
                
                {"46-CS03","ĐN","15:16","31/2/2020",false},//   Sai ngày khởi hành
                {"46-CS03","ĐN","15:16","31/14/2020",false},//    Sai tháng khởi hành
                {"46-CS03","ĐN","15:16","31/12/1999",false},//    Sai năm khởi hành
                {"46-CS03","ĐN","15:11","//",false},      //     Sai định dạng ngày
                {"46-CS03","ĐN","15:61","111/1/2020",false},//   Sai định dạng ngày
                
                {"**-****","  ","##:##","././....",false},//     Có ký tự đặc biệt
                {"","","","",false},                      //    Bỏ trống thông tin
               
                
               
                
            });
    }
    @Before
    public void init() {
        this.a = new Add();
        this.u = new Update();
       
    }
    @Test
    public void testCaseAdd() throws SQLException {
        Assert.assertEquals(this.expected,
        this.a.addJourney(this.bus));
    }
}

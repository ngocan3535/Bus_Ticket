/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;

import com.haoquy.pojo.Bus;
import com.haoquy.services.Admin.Add;
import com.haoquy.services.Admin.Update;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PrimeTesterUpdate {
    Bus bus = new Bus();
    private boolean expected;
    private Update u;
     public PrimeTesterUpdate(String id,String time,String date, boolean expected) {
            this.bus.setId(id);
            this.bus.setTime(time);
            this.bus.setDate(date);
            this.expected = expected;
    }
       @Parameterized.Parameters
     public static Collection testData() 
     {
            return Arrays.asList(new Object[][] 
            {
                {"46-CS03","15:16","9/12/2020",true}, //Đúng
                {"46-CS03","3:01","9/12/2020",true}, //Đúng(đổi định dạng giờ)
                {"46-CS03","3:15","9/1/2021",true}, //Đúng(đổi định dạng ngày)
                {"46-cs03","15:16","9/12/2020",true},//Đúng dù chữ ID in thường
                {"46-CS03","3:01","9/12/2020",true},//Đúng dù điểm đến là chữ thường
                {"46CS03","15:16","9/12/2020",false}, //Sai định dạng ID
                {"46-CS","15:16","9/12/2020",false}, //Sai định dạng ID
                {"AA-CS03","15:16","9/12/2020",false},
                {"46-5555","15:16","9/12/2020",false},//Sai định dạng ID
                {"CS-5555","15:16","9/12/2020",false},//Sai định dạng ID
                {"CS1111111","15:16","9/12/2020",false},//Sai định dạng ID
                {"46-CS03","25:16","9/12/2020",false},//Sai giờ khởi hành
                {"46-CS03","15:61","28/12/2020",false},//Sai phút khởi hành
                {"46-CS03","15:16","31/2/2020",false},//Sai ngày khởi hành
                {"46-CS03","15:16","31/14/2020",false},//Sai tháng khởi hành
                {"46-CS03","15:16","31/12/1999",false},//Sai năm khởi hành
                {"**-****","##:##","././....",false},//Có ký tự đặc biệt
                {"","","",false},//Bỏ trống thông tin
                
            });
    }
     @Before
    public void init() {
        this.u = new Update();
       
    }
      @Test
     public void testCaseUpdate() throws SQLException {
        Assert.assertEquals(this.expected,
        this.u.UpdateDateTime(this.bus));
    }
}

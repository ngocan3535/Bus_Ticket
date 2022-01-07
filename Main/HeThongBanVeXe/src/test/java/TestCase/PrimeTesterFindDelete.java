/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;


import com.haoquy.services.Admin.*;
import java.sql.SQLException;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HaoQuy
 */
@RunWith(Parameterized.class)
public class PrimeTesterFindDelete {
    private Find f;
    private Delete d;
    private final String kw;
   private final boolean expected;
    public PrimeTesterFindDelete(String kw, boolean expected) {
         this.kw = kw;
         this.expected = expected;
    }
    @Parameterized.Parameters
    public static Collection correctData()
    {
         return Arrays.asList(new Object[][] 
        {
                {"46-CS03",true},
                {"46-CS04",true},
                {"46-CS05",true},
                {"46-CS06",true},
                {"46-CS07",true},
                {"VT",false},
                {"HCM",false},
                {"15:16",false},
                {"24/12/2020",false},
                {"****",false},
                {"  ",false},
                {"",false},
                {"dadadasd",false},
                {"25/2/2021",false},
                {"24/1111/2020",false},
                {"15:20",false},
                {"05:02",false},
                {"05:12",false},
                {"46--S01",false},
                {"CS01-46",false},
                {"46-C-01",false},
         
        });
         
    }
    @Before
    public void init() {
      this.f = new Find();
      this.d = new Delete();
    }
    @Test
    public void testCaseFind() throws SQLException {
        Assert.assertEquals(this.expected,
        this.f.checkFind(this.kw));
    }
     @Test
    public void testCaseDelete() throws SQLException {
        Assert.assertEquals(this.expected,
        this.d.DeleteBus(this.kw));
    }
}

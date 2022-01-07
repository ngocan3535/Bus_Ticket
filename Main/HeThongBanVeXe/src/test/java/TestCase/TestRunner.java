/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author HaoQuy
 */

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrimeTesterAdd.class);
        Result result2 = JUnitCore.runClasses(PrimeTesterFindDelete.class);
        Result result3 = JUnitCore.runClasses(PrimeTesterUpdate.class);
         if (!result.wasSuccessful() || !result2.wasSuccessful()|| !result3.wasSuccessful()) 
        {
            result.getFailures().forEach((failure) -> 
            {
                System.err.println(failure);
                
            });
             result2.getFailures().forEach((failure) -> 
            {
                System.err.println(failure);
                
            });
              result3.getFailures().forEach((failure) -> 
            {
                System.err.println(failure);
                
            });
        } else 
             System.out.println("SUCCESS");
     }
         
}

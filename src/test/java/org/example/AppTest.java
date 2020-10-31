package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
   // @Test
   // public void shouldAnswerWithTrue()
    //{
    //    assertTrue( true );
    //}

   // public void test_IsAdult_unsuccesfully(){
        //Arrange
        //int age = 17;
        //boolean expected = false;





        //Act
        //boolean actual = App.isAdult(age);
        //boolean actual = App.calculation(age);

        //Assert
        //assertFalse(actual);


   // }
    @Test
    public void test_calculation_succesfully(){

        //Arrange

        double answer = 8;
        char ope = '+';
        double talet = 3;
        double talet1 = 5;
        boolean actual=false;




        //Act

        switch (ope) {
            case '+':
                actual = (talet + talet1 == answer);
                break;
            default:
        }

        //Assert
        assertTrue(actual);


    }
    @Test
    public void test_calculation_unsuccesfully(){

        //Arrange

        double answer = 9;
        char ope = '+';
        double talet = 3;
        double talet1 = 5;
        boolean actual=true;




        //Act

        switch (ope) {
            case '+':
                actual = (talet + talet1 == answer);
                break;
            default:
        }

        //Assert
        assertFalse(actual);


    }
}

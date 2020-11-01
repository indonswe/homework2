package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;


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

        double tryAnswer = 8;
        char ope = '+';
        double talet = 3;
        double talet1 = 5;
        boolean actual=false;




        //Act

        double answer = App.calculation(ope, talet,talet1);
        actual=(answer==tryAnswer);


        //Assert
        assertTrue(actual);


    }
    @Test
    public void test_calculation_unsuccesfully(){

        //Arrange

        double tryAnswer = 9;
        char ope = '+';
        double talet = 3;
        double talet1 = 5;
        boolean actual=true;




        //Act
        double answer = App.calculation(ope, talet,talet1);
        actual=(answer==tryAnswer);

        //Assert
        assertFalse(actual);


    }
    @Test
    public void test_checkTal_succesfully(){

        //Arrange

        int length=0;
        String tal="738";
        boolean actual=true;




        //Act
        actual = App.checkTal(tal, length);

        //Assert
        assertTrue(actual);


    }
    @Test
    public void test_checkTal_unsuccesfully(){

        //Arrange

       int length=3;
       String tal="7a8";
       boolean actual=true;




        //Act
        actual = App.checkTal(tal, length);


        //Assert
        assertFalse(actual);


    }
}

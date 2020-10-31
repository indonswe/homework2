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
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public void test_IsAdult_unsuccesfully(){
        //Arrange
        int age = 17;
        boolean expected = false;

        int answer = 9;
        char ope = '+';
        double talet = 3;
        double talet1 = 5;
        int nr = 1;



        //Act
        //boolean actual = App.isAdult(age);
        //boolean actual = App.calculation(age);

        //Assert
        //assertFalse(actual);


    }
}

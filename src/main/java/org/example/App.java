package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        boolean cal = true;
        String start;
        String tal1;
        String tal2;
        String mat;
        do{
            System.out.println("Press (enter) to start or q(enter) to quit ");
            Scanner sc = new Scanner(System.in);
            start = sc.nextLine();
            char letter = start.charAt(0);
            if (letter == 113 || letter == 81){
                break;
            }
            System.out.println("Enter number 1: ");
            Scanner scNr1 = new Scanner(System.in);
            start = scNr1.nextDouble();
            tal1 = sc.nextLine();
            int length = tal1.length();
            //System.out.println(length);
            //clean
            int talnr = 1;
            int latest = 0;
            for (int r = 0; r < length; r++) {
                char letter = name.charAt(r);
            char letter = name.charAt(r);
            else if(letter == 43){
                talnr ++;
                latest = 2;
                if (latest==2);{
                    Tal = Tal + "";
            System.out.println("Input one operator (+-*/) or q for quit: ");
            Scanner sc2 = new Scanner(System.in);
            mat = sc2.nextLine();
            System.out.println("Input number two or q for quit: ");
            Scanner sc3 = new Scanner(System.in);
            tal2 = sc3.nextLine();
        }while (cal);
    }
}
//public class input(){

    //System.out.println(age);
//}


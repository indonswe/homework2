package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        boolean cal = true;
        String start;
        String tal1;
        String operator;
        String tal2;
        String mat;
        do {
            mainMenu();
            Scanner sc = new Scanner(System.in);
            start = sc.nextLine();
            char letter = start.charAt(0);
            if (letter == 113 || letter == 81) {
                break;
            }

            System.out.println("Enter number 1: ");
            Scanner scNr1 = new Scanner(System.in);
            tal1 = scNr1.nextLine();
            int length = tal1.length();
            boolean nr1 = checkTal(tal1, length);
            System.out.println("Enter operator: ");
            Scanner scOperator = new Scanner(System.in);
            operator = scOperator.nextLine();
            System.out.println("Enter number 2: ");
            Scanner scNr2 = new Scanner(System.in);
            tal2 = scNr2.nextLine();
            int length2 = tal2.length();


        }while (true);
    }
    public static void mainMenu(){
        System.out.println("Start menu ");
        System.out.println("Press 1(enter) to start ");
        System.out.println("Press q(enter) to quit ");
    }
    public static boolean checkTal(String tal, int length){
        for (int r = 0; r < length; r++) {
            char letter = tal.charAt(r);
            Boolean flag = Character.isDigit(tal.charAt(r));
            if (flag) {
                Tal = Tal + letter;
       return flag;
    }
}

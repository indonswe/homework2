package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        boolean correct;
        boolean quit = false;
        boolean nr1 = false;
        int number;
        double talet = 0.0;
        double talet1 = 0.0;
        double answer = 0.0;

        String start;
        String tal1;
        String operator;
        String tal2;
        String mat;
        do {

            do {
                correct = false;
                mainMenu(); // print main menu
                Scanner sc = new Scanner(System.in);
                start = sc.nextLine();
                char letter = start.charAt(0);
                //System.out.println(letter);
                //if (letter == 113 || letter == 81) {
                if (letter == 'q' || letter == 'Q') {
                    quit = true;
                    correct = true;
                    //System.out.println("q");
                } else if (letter == '1') {
                    correct = true; // no valid input
                }
            } while (correct != true);
            if (quit) break; // ends the program
            System.out.println(correct);
            number = 0;
            Double d = new Double("6.35");

            nr1 = false;
            do {
                if (number==0) {
                    System.out.println("Enter first number: ");
                }else{
                    System.out.println("Enter second number: ");
                }
                Scanner scNr1 = new Scanner(System.in);
                tal1 = scNr1.nextLine();
                int length = tal1.length();
                nr1 = checkTal(tal1, length);
                //System.out.println(nr1);
                if (nr1 == false){
                    System.out.println("Input error");
                }else if (number==0){
                    talet = d.parseDouble (tal1);
                    number = 1;
                }else {
                    talet1 = d.parseDouble (tal1);
                    nr1 = true;
                    number = 2;
                }

            }while (nr1 == false || number <= 1);

            System.out.println("Enter operator: ");
            Scanner scOperator = new Scanner(System.in);
            operator = scOperator.nextLine();
            char operatorChar = operator.charAt(0);
            switch (operatorChar){
                case'+':
                    answer = talet + talet1;
                break;
                case'-':
                    answer = talet - talet1;
                    break;
                case'*':
                    answer = talet * talet1;
                    break;
                case'/':
                    answer = talet / talet1;
                    break;

                default:
            }

            System.out.println(answer);




        } while (true);
    }

    public static void mainMenu() {
        System.out.println("Start menu ");
        System.out.println("Press 1(enter) to start ");
        System.out.println("Press q(enter) to quit ");
    }

    public static boolean checkTal(String tal, int length) {
        Boolean flag = true; // = Character.isDigit(tal.charAt(r));
        char letter;
        for (int r = 0; r < length; r++) {
            letter = tal.charAt(r);
            flag = Character.isDigit(tal.charAt(r));
            if (flag != true) {
                break;
            }




        }
        return flag;
    }
}
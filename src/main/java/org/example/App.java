package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        boolean correct = false;
        boolean quit = false;
        boolean validInputcheck = false;
        int nr1or2orope = 0;
        boolean readyCalc;
        char operatorChar = 'a';
        double talet = 0.0;
        double talet1 = 0.0;
        double answer = 0.0;
        boolean mulOrDiv = false;

        String start ="";
        String tal1;
        String operator;
        String tal2;
        String mat;

        do {
            quit = mainMenu(correct, start, quit); // print main menu
            if (quit) break; // ends the program
            nr1or2orope = 0;
            talet = 0;
            mulOrDiv = false;
            Double d = new Double("0.0");//Use this to be able to parse but doesnt fully understand it

            validInputcheck = false;
            do {
                if (nr1or2orope==0) {
                    System.out.println("Enter first number: ");

                }else if(nr1or2orope == 1){
                   if (mulOrDiv){
                       System.out.println("Enter operator(+-): ");
                   }else {
                       System.out.println("Enter operator(+-*/): ");
                   }
                }
                else{
                    System.out.println("Enter a number: ");
                }
                Scanner scNr1 = new Scanner(System.in);
                tal1 = scNr1.nextLine();
                int length = tal1.length();

                if (nr1or2orope ==0 || nr1or2orope ==2){
                    validInputcheck = checkTal(tal1, length, nr1or2orope);
                    //if (nr1) readyCalc = true;
                }else{
                    operatorChar = tal1.charAt(0);
                    switch (operatorChar){
                        case'+':
                            //answer = talet + talet1;
                            break;
                        case'-':
                            //answer = talet - talet1;
                            break;
                        case'*':
                            //answer = talet * talet1;
                            if (mulOrDiv) validInputcheck=false;
                            mulOrDiv = true;
                            break;
                        case'/':
                            if (mulOrDiv) validInputcheck=false;
                            mulOrDiv = true;
                            //answer = talet / talet1;
                            break;

                        default:
                            validInputcheck=false;
                    }
                }
                //System.out.println(nr1);
                if (validInputcheck == false){
                    System.out.println("Input error");
                    System.out.println(nr1or2orope);
                    System.out.println(talet);
                    validInputcheck = true;
                }else if (nr1or2orope==0) {
                    talet = d.parseDouble(tal1);
                    nr1or2orope = 1;
                }else if (nr1or2orope==1){
                        //talet = d.parseDouble (tal1);
                        nr1or2orope = 2;
                }else {
                    talet1 = d.parseDouble (tal1);
                    validInputcheck = true;
                    talet = calculation(operatorChar,talet,talet1);
                    nr1or2orope = 1;

                    System.out.println(talet);
                    if (mulOrDiv==false) {
                        do {

                            correct = false;
                            System.out.println("Do you want to add another number to the calculation?(y/n): ");
                            Scanner sc = new Scanner(System.in);
                            start = sc.nextLine();
                            char letter = start.charAt(0);
                            if (letter == 'n' || letter == 'N') {
                                //quit = true;
                                correct = true;
                                nr1or2orope = 3;
                                //System.out.println("q");
                            } else if (letter == 'y' || letter == 'Y') {
                                correct = true; // no valid input
                            } else {
                                correct = false;
                            }
                        } while (correct != true);
                        //number = 1;
                    }else {
                        nr1or2orope = 3;
                    }
                }

            }while (validInputcheck == false || nr1or2orope <= 2);

            //System.out.println("Enter operator: ");
            //Scanner scOperator = new Scanner(System.in);
            //operator = scOperator.nextLine();
            //char operatorChar = operator.charAt(0);





        } while (true);
    }

    public static boolean mainMenu(boolean correct, String start, boolean quit) {
        System.out.println("Start menu ");
        System.out.println("Press 1(enter) to start ");
        System.out.println("Press q(enter) to quit ");
        do {
            correct = false;
            Scanner sc = new Scanner(System.in);
            start = sc.nextLine();
            char letter = start.charAt(0);
            if (letter == 'q' || letter == 'Q') {
                quit = true;
                correct = true;
                //System.out.println("q");
            } else if (letter == '1') {
                correct = true;
            }
        } while (correct != true);
        return quit;
    }

    public static boolean checkTal(String tal, int length, int num) {
        Boolean flag = true; // = Character.isDigit(tal.charAt(r));
        //char letter;
        for (int r = 0; r < length; r++) {
            //letter = tal.charAt(r);
            //if (num==1){
                //char operatorChar = String.charAt(0)
                //if (flag != true) {
                   // break;
               // }

            //}
            flag = Character.isDigit(tal.charAt(r));
            if (flag != true) {
                break;
            }




        }
        return flag;
    }
    public static double calculation (char operatorChar,double talet,double talet1){
        switch (operatorChar){
            case'+':
                talet = talet + talet1;
                //nr1or2orope = 1;
                break;
            case'-':
                talet = talet - talet1;
                //nr1or2orope = 1;
                break;
            case'*':
                talet = talet * talet1;
                //nr1or2orope = 1;
                break;
            case'/':
                talet = talet / talet1;
                //nr1or2orope = 1;
                break;

            default:
        }
        return talet;
    }

}
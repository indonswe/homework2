package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        boolean quit = false;
        boolean validInputcheck = false;
        int nr1or2orope = 0;

        char operatorChar = 'a';
        double talet = 0.0;
        double talet1 = 0.0;

        boolean mulOrDiv = false;

        String start ="";
        String tal1;

        boolean correct = false; // this variable is loose, need to work on that


        do { //main loop
            quit = mainMenu(); // handle main menu
            if (quit) break; // ends the program
            nr1or2orope = 0; // keeping track of which number/operator to ask for
            talet = 0; // answer to calculations is saved in this variable
            mulOrDiv = false; // this one is here to limit to one calculation if * or /
            Double d = new Double("0.0");//Use this to be able to parse later but doesnt fully understand it

            validInputcheck = false; // turns to true if there is a valid input
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
                tal1 = scNr1.nextLine(); // holds actual input
                int length = tal1.length();

                if (nr1or2orope ==0 || nr1or2orope ==2){
                    validInputcheck = checkTal(tal1, length); //checks number input are valid
                }else{ //checks operator input are valid
                    operatorChar = tal1.charAt(0); // got problem when moved to method so kept in main for now
                    //checkOpe(operatorChar,mulOrDiv,validInputcheck);
                    switch (operatorChar){
                        case'+':
                            break;
                        case'-':
                            break;
                        case'*':
                            if (mulOrDiv) validInputcheck=false;
                            mulOrDiv = true;
                            break;
                        case'/':
                            if (mulOrDiv) validInputcheck=false;
                            mulOrDiv = true;
                            break;

                        default:
                            validInputcheck=false;
                    }
                }

                if (validInputcheck == false){ //not valid inputs
                    System.out.println("Input error");
                    validInputcheck = true;
                }else if (nr1or2orope==0) { //handling first nr inputs
                    talet = d.parseDouble(tal1);
                    nr1or2orope = 1;
                }else if (nr1or2orope==1){ // handling operator input
                        //talet = d.parseDouble (tal1);
                        nr1or2orope = 2;
                }else { //parsing later nr inputs and send for calculations
                    talet1 = d.parseDouble (tal1);
                    validInputcheck = true;
                    System.out.println("");
                    System.out.println(talet + " " + operatorChar + " " + talet1 + " = ");
                    talet = calculation(operatorChar,talet,talet1);
                    nr1or2orope = 1;

                    System.out.println(talet); // print the answer

                    // check if more calculations should be done
                    if (mulOrDiv==false) {
                        do {

                            correct = false;
                            System.out.println("Do you want to add another number to the calculation?(y/n): ");
                            Scanner sc = new Scanner(System.in);
                            start = sc.nextLine();
                            char letter = start.charAt(0);
                            if (letter == 'n' || letter == 'N') {
                                correct = true;
                                nr1or2orope = 3;
                            } else if (letter == 'y' || letter == 'Y') {
                                correct = true;
                            } else {
                                correct = false;
                            }
                        } while (correct != true);
                        //number = 1;
                    }else {
                        nr1or2orope = 3;
                    }
                }

            }while (nr1or2orope<=2); //while (validInputcheck == false || nr1or2orope <= 2);

        } while (true); //main loop end
    } //main function end

    public static boolean mainMenu() {
        System.out.println("Start menu ");
        System.out.println("Press 1(enter) to start ");
        System.out.println("Press q(enter) to quit ");
        boolean quit = false;
        boolean correct = false;
        do {
            Scanner sc = new Scanner(System.in);
            String start = sc.nextLine();
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

    public static boolean checkTal(String tal, int length) {
        Boolean flag = true;
        for (int r = 0; r < length; r++) {
            flag = Character.isDigit(tal.charAt(r));
            if (flag != true) {
                flag = (tal.charAt(r)=='.');
            }
            if (flag != true) {
                break;
            }
        }
        return flag;
    }
    public static boolean checkOpe(char operatorChar,boolean mulOrDiv,boolean validInputcheck){
        switch (operatorChar){
        case'+':
            break;
        case'-':
            break;
        case'*':
            if (mulOrDiv) validInputcheck=false;
            mulOrDiv = true;
            break;
        case'/':
            if (mulOrDiv) validInputcheck=false;
            mulOrDiv = true;
            break;

        default:
            validInputcheck=false;
        }
        return (validInputcheck); // need to return 3 value, think I need an array
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

} // end of app
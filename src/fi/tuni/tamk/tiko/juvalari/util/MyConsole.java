package src.fi.tuni.tamk.tiko.juvalari.util;

import java.io.Console;

/**
* The class MyConsole contains basic console methods.
*
*
* @author Lari Juva
*/

public class MyConsole {
    /**
    * Method reads console input, checks if value is an integer -> if not, prints out errorMessage, else transform int input into string, get last char and return as int.
    *
    *
    * @param errorMessageNonNumeric String that contains error message
    * @return int lastInt that has a value of last digit of int input
    */
    public static int readInt(String errorMessageNonNumeric) {
        Console c = System.console();
        int input = 0;

        do {
            try {
                input = Integer.parseInt(c.readLine());
            } catch(NumberFormatException e) {
                System.out.println(errorMessageNonNumeric);
            }
        }while(input == 0);
        
        return input;
    }

    /**
    * Method 
    *
    *
    * @param min smallest value of defined range
    * @param max largest value of defined range
    * @param errorMessageNonNumeric String that contains error message, used in case of input not being numeric
    * @param errorMessageNonMinAndMax String that contains error message, used in case of input not being between min and max
    * @return int input
    */
    public static int readIntAgain(int min, int max, String errorMessageNonNumeric, String errorMessageNonMinAndMax) {
        Console c = System.console();
        int input = 0;

        do {
            try {
                input = Integer.parseInt(c.readLine());
                if(input < min || input > max) {
                    System.out.println(errorMessageNonMinAndMax);
                }
            } catch(NumberFormatException e) {
                System.out.println(errorMessageNonNumeric);
            }
        }while(input < min || input > max);

        return input;
    }
}

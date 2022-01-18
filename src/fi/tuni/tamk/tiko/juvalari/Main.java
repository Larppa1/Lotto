package src.fi.tuni.tamk.tiko.juvalari;

import src.fi.tuni.tamk.tiko.juvalari.util.Math;
import src.fi.tuni.tamk.tiko.juvalari.util.MyConsole;
import src.fi.tuni.tamk.tiko.juvalari.util.Arrays;

/**
*
* This class Main uses various classes to test different methods.
*
* @author Lari Juva
*/

public class Main {
    public static void main(String [] args) {
        String [] array = {"1", "2", "3"};
        int [] intArray = {1, 2, 3};
        int [] intArray2 = {1, 3, 7};
        String errorMessageNonNumeric = "User did not give an integer value";
        String errorMessageNonMinAndMax = "User did not give an integer value between min and max values";

        System.out.println( Math.getRandomNum(1, 10) );
        System.out.println(java.util.Arrays.toString(Arrays.toIntArray(array)));
        System.out.println(Arrays.contains(4, intArray));
        System.out.println(Arrays.containsSameValues(intArray, intArray2));
        System.out.println(MyConsole.readInt(errorMessageNonNumeric));
        System.out.println(MyConsole.readIntAgain(1, 10, errorMessageNonNumeric, errorMessageNonMinAndMax));
    }
}

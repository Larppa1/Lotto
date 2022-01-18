package src.fi.tuni.tamk.tiko.juvalari.util;

/**
* The class Math contains a basic math operations.
*
*
* @author Lari Juva
*/

public class Math {
    /**
    * Method receives int min and max as arguments. It then returns a random number between min and max values using java.lang.Math.random().
    *
    *
    * @param min the smallest possible random number generated
    * @param max the biggest possible random number generated
    * @return random int value between min and max values
    */
    public static int getRandomNum(int min, int max) {
        return min + (int) (java.lang.Math.random() * ((max - min) + 1));
    }
}
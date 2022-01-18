package src.fi.tuni.tamk.tiko.juvalari.util;

/**
* The class Arrays contains basic array operations.
*
*
* @author Lari Juva
*/

public class Arrays {
    /**
    * Method receives a String array argument. String array is transformed into a new int array and the int array is returned.
    *
    *
    * @param array String array
    * @return int array that is created from the String array
    */
    public static int [] toIntArray(String [] array) { 
        int [] intArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }

    public static int[] removeIndex(int[] original, int index) {
        int[] newNums = new int[original.length - 1];
        for(int i = 0, j = 0; i < original.length; i++) {
            if(i != index) {
                newNums[j++] = original[i];
            }
        }
        return newNums;
    }
    
    /**
    * Method receives int value and int array as arguments. It then checks if array contains value and returns boolean that is true or false depending if array contains value.
    *
    *
    * @param value integer which the method tries to find out if it is contained in a given int array
    * @param array int array which is checked for containing int value
    * @return boolean contains which is true when array contains value, otherwise false
    */
    public static boolean contains(int value, int [] array) {
        boolean contains = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                contains = true;
            }
        }
        return contains;
    }

    /**
    * Method receives two int arrays as arguments. It then checks how many same values the arrays contain and returns the amount of same values as int.
    *
    *
    * @param array int array
    * @param array2 int array
    * @return int sameValues that indicates how many of the same values are in array and array2
    */
    public static int containsSameValues(int [] array, int [] array2) { 
        int sameValues = 0;

        for(int i = 0; i < array.length; i++) {
            int j = 0;
            for(j = 0; j < array2.length; j++) {
                if(array[i] == array2[j]) {
                    sameValues = sameValues + 1;
                }
            }
        }
        return sameValues;
    }

    public static int [] sort(int [] array) {
        int length = array.length;
        for(int i = 0; i < length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int tempArray = array[min];
            array[min] = array[i];
            array[i] = tempArray;
        }
        return array;
    }

    public static String [] addPrefix(int [] array) {
        String [] stringArray = new String[7];
        for(int i = 0; i < 7; i++) {
            if(array[i] < 10) {
                stringArray[i] = "0" + String.valueOf(array[i]);
            }else {
                stringArray[i] = String.valueOf(array[i]);
            }
        }
        return stringArray;
    }
}

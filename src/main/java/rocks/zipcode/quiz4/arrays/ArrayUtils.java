package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] newArray = new String[values.length-1];
        int mid = values.length/2;
        for (int i = 0; i < mid; i++) {
            newArray[i] = values[i];
        }
        for (int i = mid; i < values.length - 1; i++) {
            newArray[i] = values[i+1];
        }
        return newArray;
    }

    public static String getLastElement(String[] values) {
        int length = values.length;
        String string = values[length-1];
        return string;
    }

    public static String[] removeLastElement(String[] values) {
        String[] newArray = new String[values.length-1];
        int j =0;
        for (int i = 0; i < values.length ; i++) {
            if(i != values.length-1){
                newArray[j] = values[i];
            }
            j++;
        }
        return newArray;
    }
}

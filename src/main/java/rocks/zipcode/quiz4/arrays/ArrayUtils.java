package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int length = values.length/2;
        String string = values[length];
        return string;
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] newArray = new String[values.length-1];
        int j =0;
        for (int i = 0; i < values.length-1 ; i++) {
            if(i != values.length/2){
                newArray[j] = values[i];
            }
            j++;
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
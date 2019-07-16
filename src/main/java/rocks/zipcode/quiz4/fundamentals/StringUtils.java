package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int length = string.length();
        length /= 2;
        Character middle = string.charAt(length);
        return middle;
    }

    public static String capitalizeMiddleCharacter(String str) {
        if (str.length() == 1){return str.toUpperCase();}
        int length = str.length();
        length /= 2;
        StringBuffer sb = new StringBuffer(str);
        Character ch = Character.toUpperCase(sb.charAt(length));
        String string = sb.toString().toUpperCase();
        return string;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        if (str.length() == 1){return str.toUpperCase();}
        int length = str.length();
        length /= 2;
        StringBuffer sb = new StringBuffer(str);
        Character ch = Character.toLowerCase(sb.charAt(length));
        String string = sb.toString().toLowerCase();
        return string;
    }

    public static Boolean isIsogram(String str) {
        int length = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < length - 1; i++) {
            if(arr[i] == arr[i+1])
                return false;
        }

        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char arr[] = str.toCharArray();

      //  Arrays.sort(arr);
        for (int i = 0; i < str.length() - 1; i++) {
            if(arr[i] == arr[i+1])
                return true;
        }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

      /*  ArrayList<Character> list = new ArrayList<>(str.length());

          Arrays.sort(arr);
        for(Character i : list) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i);
            }
        }
        String string = list.toString();
        */
     int a = 1, b = 1;

      char arr[] = str.toCharArray();

      while (b != arr.length-1){
          if(arr[b] != arr[b-1]){
              arr[a] = arr[b];
              a++;
          }
          b++;
      }

      str = new String(arr);
        return str;

    }

    public static String invertCasing(String str) {
        return null;
    }
}
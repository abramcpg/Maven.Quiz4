package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2)+
                getMiddleCharacter(str.toUpperCase())+
                str.substring(str.length()/2+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length()/2)+
                getMiddleCharacter(str.toLowerCase())+
                str.substring(str.length()/2+1);
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
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }

        return chars.toString();
    }
}

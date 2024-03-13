import java.util.Scanner;

public class Student {
    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
         stringBuilder.reverse();

         return stringBuilder.toString();
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <input.length() ; i++) {
            char currentChar = input.charAt(i);

            if (result.indexOf(String.valueOf(currentChar)) == -1){
                result.append(currentChar);
            }
        }
        return result.toString();

    }
}

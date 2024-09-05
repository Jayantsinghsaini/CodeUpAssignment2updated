/***
 * NAME - JAYANT SINGH
 * DATE - 04-09-2024
 * When the program is run, we will first enter a string. After that, the program should
 * ask us which operation we want to execute on the string. The available operations are
 * listed below: Append, CountWords, Replace, isPalindrome, Splice, Split,
 * MaxRepeatingCharacter, Sort, Shift, and Reverse. Each method should perform its
 * respective operation based on the user's input.
 */

import java.util.Scanner;
import java.util.StringTokenizer;
public class MyString {
    public static void reverse(String firststring) {

        String secondstring = "";
        for (int i = firststring.length() - 1; i >= 0; i--) {
            secondstring = secondstring + firststring.charAt(i);
        }
        System.out.println(Constant.REVERSE_STRING+secondstring);
    }
    public static void palindrome(String firststring){
        String secondstring = "";
        for (int i = firststring.length() - 1; i >= 0; i--) {
            secondstring = secondstring + firststring.charAt(i);
        }
        if (firststring.equals(secondstring)){
            System.out.println(Constant.IS_PALINDROME);
        }
        else {
            System.out.println(Constant.NOT_PALINDROME);
        }
    }
    public static void append(String firststring){
    Scanner sc = new Scanner(System.in);
    System.out.println(Constant.ENTER_AND_TERMINATE);
    while (true) {
        String secondstring = sc.nextLine();
        if(secondstring.equals("clr")){
            break;
        }
        else {
            firststring = firststring + " " + secondstring;
            System.out.println(firststring);
        }
    }
}
    public static void sort(String firststring){
    char arrayofcharacter[] = firststring.toCharArray();
    for (int i = 0 ; i < arrayofcharacter.length ; i++) {
        for (int j = 0 ; j <arrayofcharacter.length-1-i ; j++) {
            if (arrayofcharacter[j] > arrayofcharacter[j+1]){
                char temp = arrayofcharacter[j];
                arrayofcharacter[j] = arrayofcharacter[j+1];
                arrayofcharacter[j+1] = temp;
            }
        }
    }
        System.out.print(Constant.SORTED_STRING);
    for (int i = 0 ; i < arrayofcharacter.length ; i++) {
        System.out.print(arrayofcharacter[i]);
    }
        System.out.println();
}
    public static void splice(String firststring){
        Scanner sc = new Scanner(System.in);
    char arrayofcharacter[] = firststring.toCharArray();
    System.out.println(Constant.ENTER_INDEX);
    int index = sc.nextInt();
    System.out.println(Constant.ENTER_LENGTH);
    int length = sc.nextInt();
    char mainarrayofcharacter[] = new char[arrayofcharacter.length-length];
    for (int i = 0 ; i < arrayofcharacter.length ; i++) {
        if (i < index){
            mainarrayofcharacter[i] = arrayofcharacter[i];
        }
        else if(i > (index + length -1)){
            mainarrayofcharacter[i - length] = arrayofcharacter[i];
        }
    }
        System.out.print(Constant.RESULT);
    for (int i = 0 ; i < mainarrayofcharacter.length ; i++) {
        System.out.print(mainarrayofcharacter[i]);

    }
        System.out.println();
}
    public static void shift(String firststring){
        Scanner sc = new Scanner(System.in);
        System.out.println(Constant.SHIFT_INDEX);
        int index = sc.nextInt();
        String first_half_of_string = "";
        String second_half_of_string = "";
        for (int i = 0 ; i <= index ; i++) {
            first_half_of_string = first_half_of_string + firststring.charAt(i);
        }

        for (int i = (index +1) ; i < firststring.length() ; i++) {
            second_half_of_string = second_half_of_string + firststring.charAt(i);
        }
        System.out.println(Constant.RESULT + second_half_of_string + first_half_of_string);
    }
    public static void maxrepeat(String firststring){
        int maximum_count = 0;
        char maximum_character =firststring.charAt(0);
        for (int i=0;i<firststring.length();i++) {
            char currentcharacter = firststring.charAt(i);
            int count = 0;
            for (int j = 0;j<firststring.length();j++) {
                if (firststring.charAt(j) == currentcharacter) {
                    count++;
                }}
            if (count > maximum_count) {
                maximum_count = count;
                maximum_character = currentcharacter;
            }}
        System.out.println(Constant.MAXIMUM_REPEAT+maximum_character+" -> "+maximum_count );

        }
    public static void replace(String firststring) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println(Constant.ENTER_CHARACTER);
        char character = sc.next().charAt(0);
        System.out.println(Constant.ENTER_REPLACE_CHARACTER);
        char replacecharacter = sc.next().charAt(0);

        for (int i = 0; i < firststring.length() ; i++) {
            char currentcharacter = firststring.charAt(i);
            if (currentcharacter == character) {
                result = result + replacecharacter;
            } else {
                result = result + currentcharacter;
            }
        }
        System.out.print(Constant.RESULT);
        System.out.println(result);
    }
    public static void split(String firststring){
        StringTokenizer tokens = new StringTokenizer(firststring, " ");
        int tokenCount = tokens.countTokens();
        String tokensArray[] = new String[tokenCount];
        tokens = new StringTokenizer(firststring, " ");

        int index = 0;
        while (tokens.hasMoreTokens()) {
            tokensArray[index++] = tokens.nextToken();
        }
        System.out.print(Constant.WORDS_ARRAY);
        for (int i = 0; i < tokensArray.length ; i++) {
            System.out.print(tokensArray[i] + ",");
        }
        System.out.println();
    }
    public static void countwords(String firststring){
        String arr[] = firststring.split(" ");
        System.out.println(Constant.TOTAL_WORDS + arr.length);

    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Constant.ENTER_STRING);
        String firststring = sc.nextLine();
            System.out.println(Constant.METHOD_COMMENT);
            do {
                System.out.println(Constant.ENTER_METHODKEY);
                int methodkey = sc.nextInt();
                sc.nextLine();

                switch (methodkey) {
                    case 0:
                        System.out.println(Constant.RE_ENTER_STRING);
                        firststring = sc.nextLine();
                        break;
                case 1:
                    reverse(firststring);
                    break;
                case 2:
                    palindrome(firststring);
                    break;
                case 3:
                    append(firststring);
                    break;
                case 4:
                    sort(firststring);
                    break;
                case 5:
                    splice(firststring);
                    break;
                case 6:
                    shift(firststring);
                    break;
                case 7:
                    maxrepeat(firststring);
                    break;
                case 8:
                    replace(firststring);
                    break;
                case 9:
                    split(firststring);
                    break;
                case 10:
                    countwords(firststring);
                    break;

                    default:
                        System.out.println(Constant.INVALID_METHODKEY);
                        break;


            }} while (true);
}}
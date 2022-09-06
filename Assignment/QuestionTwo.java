package Week4.Day13.Assignment;

//2) Count the total number of vowels and consonants in a string.

import java.util.HashSet;

public class QuestionTwo {
    public static void main(String[] args) {
        countVowelsAndConsonants("Ashraf");
        removeRepeatedCharacters("AshrafShaikh");
        removeWhiteSpaces("                     AShraf              ");
        StringtoArray("Ashraf");
    }

    public static void countVowelsAndConsonants(String string) {
        int vowelCounter = 0;
        int consonantCounter = 0;

        for(int i = 0 ; i < string.length() ; i++) {
            char c = string.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                vowelCounter++;
            else
                consonantCounter++;
        }

        System.out.println("NUmber of Vowels :: "+vowelCounter);
        System.out.println("Number of Consonants :: "+consonantCounter);
    }

    /*
    NUmber of Vowels :: 2
    Number of Consonants :: 4
    * */


//    3) Remove all repeated characters from a given string.

    public static void removeRepeatedCharacters(String string) {
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0 ; i < string.length() ; i++) {
            hs.add(string.charAt(i));
        }
        String ans = "";

        for(Character c : hs) {
            ans +=c;
        }

        System.out.println("String after removing repeated characters :: "+ans);

    }

    /*
    String after removing repeated characters :: AarsSfhik
    * */

//    4)Remove both leading and trailing white space characters from the given string and
//    also showcase the Unicode value of the character present at index 5.
    public static void removeWhiteSpaces(String string) {
        String answer = string.trim();
        System.out.println("After removing spaces :: "+answer);
        System.out.println("Unicode value at index 5 is : "+string.codePointAt(5));

    }

    /*

    After removing spaces :: AShraf
    Unicode value at index 5 is : 32

    * */

//    6)Convert String data into array and present it
    public static void StringtoArray(String string) {
        char array[] = string.toCharArray();

        System.out.println("Printing Array of given String :: ");
        for(Character c : array) {
            System.out.println(c);
        }
    }

    /*

    A
    s
    h
    r
    a
    f

    * */






}

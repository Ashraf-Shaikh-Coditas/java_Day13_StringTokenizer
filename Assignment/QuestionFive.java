package Week4.Day13.Assignment;

import java.util.Scanner;

//5)Accept 5 names of string type, count the length.and as per their length assign there
//order (Ascending).
//=>Replace above strings "vowel characters" with their next letter.
//=>Ex. "Aarti" => Vowels present here are = =>a(2).i(1)
//=>next character of "a" is "b" and for "i" its "i"
//=>so.final string will be "bbrtij"

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values to be inserted :: ");
        String[] array = new String[5];

        for(int i = 0; i < 5 ; i++) {
            array[i] = scanner.nextLine();
        }

        for(int i = 0 ; i < array.length -1 ; i++) {
            for(int j = 0 ; j < array.length -1 - i ; j++) {
                if(array[j].length() > array[j+1].length()) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp ;
                }
            }
        }

        System.out.println("Sorted Array :: ");
        for (String s : array) {
            System.out.println(s);
        }

        for (int k =0 ; k < array.length ; k++) {
            char[] charArray = array[k].toCharArray();
            for(int i = 0 ; i  < charArray.length ; i++) {
                if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
                || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O'
                        || charArray[i] == 'U' ) {
                    charArray[i]++;

                }
            }

            String ans = "";
            for(Character c : charArray) {
                ans += c;
            }

            array[k] = ans;
        }

        System.out.println("After operation :: ");
        for(String s : array) {
            System.out.println(s);
        }



    }
}

/*

Enter the values to be inserted ::
Ashraf
Alex
Eoin
Sam
Tom

Sorted Array ::
Sam
Tom
Alex
Eoin
Ashraf

After operation ::
Sbm
Tpm
Blfx
Fpjn
Bshrbf


* */
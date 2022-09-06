package Week4.Day13.Assignment;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        multipleDelimiters("Hi,all. How are you?");
        separateTokensAndOperators("1+2-3+4");
    }

//    7)WAP where you will have two different delimiters ,like "Hi,all. How are you?"
//    Here,you have to find all delimiters as a token like, (space, ",",".","?").

    public static void multipleDelimiters(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string,",|.|?|' '",true);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }

    /*

        Hi
        ,
        all
        .

        How

        are

        you
        ?

    * */


//    8)Separate the tokens(operands and operators) from below statement:
//            3+ (20%2) * (20/2)
//    Case 1)Print separated tokens
//    Case 2)Print Operators and Operand separately

    public static void separateTokensAndOperators(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string,"+|-|*|/",true);
        System.out.println("Separated Tokens :: ");
        ArrayList<String> arrayList = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            arrayList.add(s);
            System.out.println(s);
        }

        System.out.println("Operators : ");
        for (String s : arrayList) {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
                System.out.println(s);
            }
        }

        System.out.println("Operands : ");
        for (String s : arrayList) {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
            } else {
                System.out.println(s);
            }
        }

        /* OUTPUT
        Separated Tokens ::
        1
        +
        2
        -
        3
        +
        4
        Operators :
        +
        -
        +
        Operands :
        1
        2
        3
        4

        * */

}}
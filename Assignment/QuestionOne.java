package Week4.Day13.Assignment;
//1)Accept the strings(HARD CODE VALUES/USER ACCEPTED),as per their length and
//reorder it

public class QuestionOne {
    public static void main(String[] args) {
        String[] array = {"One","Two","Three","Four","Thirteen","Eleven","Hundred"};

        for(int i = 0 ; i < array.length -1 ; i++) {
            for(int j = 0 ; j < array.length -1 - i ; j++) {
                if(array[j].length() > array[j+1].length()) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp ;
                }
            }
        }

        for (String s : array) {
            System.out.println(s);
        }

    }
}

/*

One
Two
Four
Three
Eleven
Hundred
Thirteen


 */

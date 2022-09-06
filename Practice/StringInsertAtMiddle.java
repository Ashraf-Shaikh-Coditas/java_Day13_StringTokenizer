package Week4.Day13.Practice;

public class StringInsertAtMiddle {
    public static void main(String[] args) {
        String str = "Welcome to Family";

        String array[] = str.split(" ");

        str = "";
        for(String s : array ) {
            if(s.equals("to")) {
                str += " "+s+" Coditas ";
            } else {
            str += s;
            }
        }
        System.out.println(str);
    }
}

/* OUTPUT :

    Welcome to Coditas Family


* */
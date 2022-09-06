package Week4.Day13.Practice;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hi there ");
        System.out.println(stringBuilder);

        stringBuilder.append("How are you ? ");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.charAt(1));

        stringBuilder.delete(3,8);
        System.out.println(stringBuilder);

        stringBuilder.insert(3,"Coditas");
        System.out.println(stringBuilder);

        stringBuilder.replace(0,2,"Hello");
        System.out.println(stringBuilder);
    }
}

/*

Hi there
Hi there How are you ?
i
Hi  How are you ?
Hi Coditas How are you ?
Hello Coditas How are you ?


* */
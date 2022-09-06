package Week4.Day13.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hi there ");
        System.out.println(stringBuffer);

        stringBuffer.append("How are you ? ");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.charAt(1));

        stringBuffer.delete(3,8);
        System.out.println(stringBuffer);

        stringBuffer.insert(3,"Coditas");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,2,"Hello");
        System.out.println(stringBuffer);
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
package sloth.zhang;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {
    public static void main(String[] args) {
            String s1="zhangyanan shi";
            String s2="liyuzhu";
            int i=s1.indexOf("y");
            int j=s2.lastIndexOf("z");
            char s3=s1.charAt(2);
            String s4=s1.substring(3);
            String s5=s2.substring(2,4);
            String s6="   zhang  ya   nan";
            String s7=s6.trim();
            String s8=s1.replace("shi","bushi");
            Boolean b=s1.startsWith("zhang");
            Boolean c=s2.endsWith("li");
            Boolean d=s1.equals(s2);
            Boolean e=s1.equalsIgnoreCase(s2);
            String a2="zhan HHGIGH";
            String a3=a2.toLowerCase();
            String a4=a2.toUpperCase();
            System.out.println(a2);
        System.out.println(i);
        System.out.println(j);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}

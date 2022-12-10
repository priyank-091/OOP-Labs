import java.lang.*;
import java.util.*;

public class StringDemo {
    public static void main(String[] args) {
        // String s2 = new String("Params");
        // System.out.println(s2);
        // System.out.println(s2.length());
        StringBuffer sb = new StringBuffer("Params2");
        System.out.println(sb);
        String s1 = new String(sb);
        System.out.println(s1);
        byte[] b = { 101, 102, 103 };
        String s2 = new String(b);
        System.out.println(s2);
        char[] c = { 'a', 'b', 'c' };
        String s3 = new String(c);
        System.out.println(s3);
        char[] c2 = new char[] { 'a', 'b', 'c' };
        for (char temp : c2) {
            System.out.println(temp);
        }
        System.out.println("c2 = " + c2);
        String s4 = new String(c2);
        System.out.println(s4);
        StringBuilder s5 = new StringBuilder("hello");
        StringBuilder s6 = new StringBuilder("world");
        s5.append(s6);
        System.out.println(s5.toString());
    }
}

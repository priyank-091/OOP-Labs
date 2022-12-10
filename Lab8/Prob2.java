import java.util.*;
import java.util.regex.*;

public class Prob2 {
    public static void main(String[] args){
        String s1 = args[0];
        Pattern p1 = Pattern.compile("[1-7][0-9]{5}");
        Matcher m1 = p1.matcher(s1);
        if(m1.find()){
            System.out.println("Valid Pincode");
        }
        else{
            System.out.println("Invalid Pincode");
        }
    }
}

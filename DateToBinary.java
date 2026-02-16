package JAVA;
import java.util.*;
public class DateToBinary {
    public static void main(String[] args) {
        String s = "2080-02-29";
        String s1 = "";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                s1 += s.charAt(i);
            } else {
                int num = Integer.parseInt(s1);
                String bin = "";
                while (num != 0) {
                    int digit = num % 2;
                    bin = digit + bin; 
                    num = num / 2;
                }
                if (!res.isEmpty()) res += "-";  
                res += bin;  
                s1 = "";
            }
        }
        if (!s1.isEmpty()) {
            int num = Integer.parseInt(s1);
            String bin = "";
            while (num != 0) {
                int digit = num % 2;
                bin = digit + bin;
                num = num / 2;
            }
            if (!res.isEmpty()) res += "-";  
            res += bin;
        }
        System.out.println( res);
    }
}

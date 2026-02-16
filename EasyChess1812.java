package JAVA;
import java.util.*;
public class EasyChess1812 {
    public static void main(String[] args) {
       String s="a1";
        char ch1=s.charAt(0);
        char ch2=s.charAt(1);
        if((ch1%2!=0 && ch2%2!=0)||(ch1%2==0 && ch2%2==0)) return false;
        return true;
    }
}

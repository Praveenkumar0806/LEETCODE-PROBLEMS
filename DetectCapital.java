package JAVA;
import java.util.*;
public class DetectCapital {
    public static void main(String[] args) {
       String s="USA";
        int count=0;
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                count++;
            }
        }
        if(count==n)return true;
        if(count==0)return true;
        if(count==1 && s.charAt(0)>='A' && s.charAt(0)<='Z') return true;
        return false;
    }
}

package JAVA;
import java.util.*;
public class IsomorphicStrings205  {
    public static void main(String[] args) {
       String s1= "egg";
       String s2="add";
       char[] ch1=new char[128];
        char[] ch2=new char[128];
        for(int i=0;i<s1.length();i++)
        {
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if(ch1[a]==0 && ch2[b]==0)
            {
                ch1[a]=b;
                ch2[b]=a;
            }
            if(ch1[a]!=b && ch2[b]!=a) return false ;
        }
        return true;
    }

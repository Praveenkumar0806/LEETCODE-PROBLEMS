 import java.util.*;
public class ReverseCharachterSamePlace {
    public static void main(String[] args) {
 String s = "!@#$%^&*()";
        char[] ch = new char[s.length()];
        String car = "";
        String spec = "";
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                    || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    || s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                car =s.charAt(i)+car;

            }
            else
            {
                spec=s.charAt(i)+spec;
            }
        }
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                    || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    || s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                ch[i]=car.charAt(x++);
            }
            else
            {
                ch[i]=spec.charAt(y++);
            }
        }
        //System.out.println(car);
        //System.out.println(spec);
        //System.out.println(Arrays.toString(ch));
        for(int i=0;i<ch.length;i++)
        {
            res+=ch[i];
        }
        System.out.println(res);
    }
}

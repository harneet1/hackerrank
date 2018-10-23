import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void separateNumbers(String s)
    {
        int flag = 0;
        long initial = -1;
        for(int i = 1 ; i <= s.length()/2; i++)
        {
            //long test = Long.parseLong(s.substring(0, i));
            //String str = s.substring(0 ,i);
            long num = Long.parseLong(s.substring(0, i));
            initial = num;
            //String test = "";
            String test = Long.toString(num);
            while(test.length() < s.length())
            {
                num = num + 1;
                String x = Long.toString(num);
                test = test + x;
                
            }
            if(test.equals(s))
            {
                flag = 1;
                break;
            }
            
        }
        if(flag == 1)
        {
            System.out.println("YES" + " " + initial);
        }
        else
        {
            System.out.println("NO");
        }
    }
        
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }
}


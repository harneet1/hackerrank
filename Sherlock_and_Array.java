import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        
        int i = 1;
        int j = a.length-1-1;
        int count1 = sum - a[0];
        int count2 = sum - a[a.length-1];
        int flag = 0;
        while(i < j)
        {                    
            if(count1 < count2)
            {
                count2 = count2 - a[j];
                j--;
            }                
            else
            {
                count1 = count1 - a[i];
                i++;
            }                
        }
        //System.out.println(count1 + " " + count2);
        if(count1 == count2)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}


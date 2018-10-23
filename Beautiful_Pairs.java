import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int[] count(int[] res)
    {
        int[] arr = new int[1000];
        for(int i = 0; i < res.length; i++)
        {
            arr[res[i]-1] = arr[res[i]-1] + 1;
        }
        return arr;
    }
    
    static int beautifulPairs(int[] A , int[] B){
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] count1 = new int[1000];
        int[] count2 = new int[1000];
        
        count1 = count(A);
        count2 = count(B);
        //System.out.println(Arrays.toString(count1));
        //System.out.println(Arrays.toString(count2));
        int result = 0;
        for(int i = 0; i < count1.length; i++)
        {
            if(count1[i] == count2[i])
            {
                result = result + count1[i];
            }
            else
            {
                result = result + Math.min(count1[i], count2[i]);
            }
        }
        
        if(result == A.length)
        {
            return result - 1;
        }
        else
        {
            return result + 1;
        }


                
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        int result = beautifulPairs(A, B);
        System.out.println(result);
        in.close();
    }
}


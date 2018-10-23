import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pylons(int k, int[] arr) {
        
        int count = 0;
        int flag = 0;
        int i = 0;
        int j = 0;
        int current = 0;
        int n = arr.length;
        while(i < n)
        {
            count = count + 1;
            j = i + k - 1;
            
            if(j > n)
                j = n - 1;
            
            while(current <= j && j < n && arr[j] == 0)
            {
                j = j - 1;
            }
            
            if(j < current)
            {
                flag = 1;
                break;
            }
            current = j + 1;
            j = j + k;
            i = j;            
        }
        if(flag == 1)
            return -1;
        else
            return count;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pylons(k, arr);
        System.out.println(result);
        in.close();
    }
}


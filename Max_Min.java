import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int angryChildren(int k, int[] arr) {
        Arrays.sort(arr);
        int low = 0;
        int high = k-1;
        double unfair = Double.POSITIVE_INFINITY;
        for(int i = 0; i < arr.length-k+1; i++)
        {
            int min = Math.abs(arr[low] - arr[high]);
            if(min < unfair)
            {
                unfair = min; 
            }
            low = low + 1;
            high = high + 1;
        }
        return (int)unfair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = angryChildren(k, arr);
        System.out.println(result);
        in.close();
    }
}


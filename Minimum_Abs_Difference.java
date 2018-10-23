import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);
        double min = Double.POSITIVE_INFINITY;
        for(int i = 0; i < arr.length-1; i++)
        {
            int diff = Math.abs(arr[i] - arr[i+1]);
            if(diff < min)
            {
                min = diff;
            }
        }
      return (int)min;   

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}


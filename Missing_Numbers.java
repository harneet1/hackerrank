import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] missingNumbers(int[] arr, int[] brr) {
        
        int[] count = new int[10000];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < brr.length; i++)
            count[brr[i]-1] = count[brr[i]-1] + 1;
        //System.out.println(Arrays.toString(count));
        for(int i = 0; i < arr.length; i++)
            count[arr[i]-1]--;
        
        
        for(int i = 0; i < count.length; i++)
        {
            if(count[i] > 0)
                list.add(i+1);
        }
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        
        return result;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}


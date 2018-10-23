import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sansaXor(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = n;
        for(int i = 0; i < (int)Math.ceil((double)arr.length/2); i++)
        {
            list.add(n*(i+1));
            n = n - 1;
        }
        //System.out.println(list);
        if(m%2 == 1)
        {
            for(int i = list.size()-2; i >= 0; i--)
                list.add(list.get(i));
        }
        else
        {
            for(int i = list.size()-1; i >= 0; i--)
                list.add(list.get(i));
        }
        //System.out.println(list);
        int result;
        if(list.get(0)%2 == 0)
            result = 0;
        else
            result = arr[0];
        
        for(int i = 1; i < list.size(); i++)
        {
            if(list.get(i)%2 == 0)
                result = result ^ 0;
            else
                result = result ^ arr[i];
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = sansaXor(arr);
            System.out.println(result);
        }
        in.close();
    }
}


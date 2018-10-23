import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int toys(int[] w) {
        Arrays.sort(w);
        List<Integer> list = new ArrayList();
        //list.add(w[0]);
        int j = 0;
        int count = 0;
        while(w.length != list.size())
        {
            int min = w[j];
            int range = min + 4;
            count = count + 1;
            while(w[j] <= range)
            {
                list.add(w[j]);
                j = j+1;
                if(w.length == list.size())
                {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        for(int w_i = 0; w_i < n; w_i++){
            w[w_i] = in.nextInt();
        }
        int result = toys(w);
        System.out.println(result);
        in.close();
    }
}


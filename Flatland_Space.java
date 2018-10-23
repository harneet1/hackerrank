import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int flatlandSpaceStations(int n, int[] c) {
        
        Integer max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            Integer min = Integer.MAX_VALUE;
            for(int j = 0; j < c.length; j++)
            {
                if((int)Math.abs(i - c[j]) < min)
                    min = Math.abs(i - c[j]);
            }
            if(min > max)
                max = min;
        }
        return max;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        in.close();
    }
}


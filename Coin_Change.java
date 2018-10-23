import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(long n, long[] c){
        long[][] aux = new long[(int)n+1][c.length];
        for(int i = 0; i < c.length; i++)
            aux[0][i] = 1;
        
        for(int i = 1; i < n+1; i++)
        {
            for(int j = 0; j < c.length; j++)
            {
                long x = (i - (int)c[j] >= 0)? aux[i - (int)c[j]][j] : 0;
                long y = (j >= 1)? aux[i][j-1] : 0;
                aux[i][j] = x + y;
            }
        }
        //System.out.println(Arrays.deepToString(aux));
        return aux[(int)n][c.length - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}


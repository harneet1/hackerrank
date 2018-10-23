import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMinimumCost(int n, int k, int[] c){
        Arrays.sort(c);
        List<Integer> list = new ArrayList<>();
        
        for(int i = c.length-1; i >= 0; i--)
        {
            list.add(c[i]);
        }
        //System.out.println(list);
        
        int round = (int)Math.ceil((double)c.length/k);
        //System.out.println(round);
        int total = 0;
        for(int i = 0; i < round; i++)
        {
            int initialCost = i + 1;            
            int j = i*k;
            while(j < (i+1)*k && j < c.length)
            {
                int finalCost = initialCost * list.get(j);
                total = total + finalCost;
                j = j + 1;
            }
        }
        return total;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}


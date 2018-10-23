import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int luckBalance(int n, int k, int[][] contests) {
        //List<Integer> lowPriority = new ArrayList<>();
        List<Integer> highPriority = new ArrayList<>();
        int luck = 0;
        for(int i = 0; i < n; i++)
        {
            if(contests[i][1] == 0)
            {
                luck = luck + contests[i][0];
            }
            else
            {
                highPriority.add(contests[i][0]);
            }
        }
        
        Collections.sort(highPriority, Collections.reverseOrder());
        
        for(int i = 0; i < k && i < highPriority.size(); i++)
        {
            luck = luck + highPriority.get(i);
        }
        //System.out.println(i);
        for(int i = k; i < highPriority.size(); i++)
        {
            luck = luck - highPriority.get(i);
        }
        return luck;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] contests = new int[n][2];
        for(int contests_i = 0; contests_i < n; contests_i++){
            for(int contests_j = 0; contests_j < 2; contests_j++){
                contests[contests_i][contests_j] = in.nextInt();
            }
        }
        int result = luckBalance(n, k, contests);
        System.out.println(result);
        in.close();
    }
}


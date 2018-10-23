import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumLoss(long[] price) {
        
        Map<Long, Integer> map = new HashMap<>();
        
        for(int i = 0; i < price.length; i++)
            map.put(price[i], i);
        
        Arrays.sort(price);
        double min = Double.POSITIVE_INFINITY;
        for(int i = 0; i < price.length-1; i++)
        {
            if((map.get(price[i]) > map.get(price[i+1])) && (price[i+1] - price[i] < min))
                min = price[i+1] - price[i];
        }
        return (int)min;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] price = new long[n];
        for(int price_i = 0; price_i < n; price_i++){
            price[price_i] = in.nextLong();
        }
        int result = minimumLoss(price);
        System.out.println(result);
        in.close();
    }
}


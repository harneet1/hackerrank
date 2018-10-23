import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] jimOrders(int[][] orders) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < orders.length; i++)
        {
            list.add(orders[i][0] + orders[i][1]);
        }
        
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        Collections.sort(list);
        
        int[] result = new int[list.size()];
        
        
//         Set<Integer> set = new HashSet<>();
//         for(int i = 0; i < list.size(); i++)
//         {
//             set.add(list.get(i));
//         }
        
//         if(set.size() == 1)
//         {
//             for(int i = 0; i < list.size)
//         }
        
        for(int i = 0; i < newList.size(); i++)
        {
            int index = newList.indexOf(list.get(0));
            result[i] = index + 1;
            newList.set(index, -1);
            list.remove(0);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] orders = new int[n][2];
        for(int orders_i = 0; orders_i < n; orders_i++){
            for(int orders_j = 0; orders_j < 2; orders_j++){
                orders[orders_i][orders_j] = in.nextInt();
            }
        }
        int[] result = jimOrders(orders);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}


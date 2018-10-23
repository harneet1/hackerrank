import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the sillyGame function below.
     */
    static String sillyGame(int n) {
        
        int[] prime = new int[n+1];
        // 0 is taken as prime
        prime[0] = 1;
        prime[1] = 1;
        for(int i = 2; i*i <= n; i++)
        {
            if(prime[i] == 0)
            {
                for(int j = 2*i; j <= n; j = j+i)
                    prime[j] = 1;
            }
        }
        //System.out.println(Arrays.toString(prime));
        int length = 0;
        for(int k = 0; k < n+1; k++)
        {
            if(prime[k] == 0)
                length++;
        }
        //System.out.println(length);
        if((length%2) == 1)
        {
            String str = "Alice";
            return str;
        }
        else
        {
            String str = "Bob";
            return str;
        }
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            String result = sillyGame(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}


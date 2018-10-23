import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static boolean check(String a)
    {
        int flag = 0;
        for(int i = 0; i < a.length()-1; i++)
        {
            if((i == 0) && (a.charAt(i) != a.charAt(i+1)))
            {
                flag = 1;
                break;
            }
            else if((i == a.length()-1) && (a.charAt(i) != a.charAt(i-1)))
            {
                flag = 1;
                break;
            }
            else if((a.charAt(i) != a.charAt(i+1)) && (a.charAt(i) != a.charAt(i-1)))
            {
                flag = 1;
                break;
            }
            else
                continue;
        }
        if(flag == 1)
            return true;
        else
            return false;
    }
    static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < b.length(); i++)
        {
            if(map.containsKey(b.charAt(i)))
            {
                int count = map.get(b.charAt(i)) + 1;
                map.replace(b.charAt(i), count);
            }
            else
                map.put(b.charAt(i), 1);
        }
        //System.out.println(map);
        int flag = 0;
        boolean a = map.containsKey('_');
        if((!a) && (check(b)))
            return "NO";
        else
        {
            map.remove('_');
            for(Integer j : map.values())
            {
                if(j < 2)
                {
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1)
                return "NO";
            else
                return "YES";
        }
            
            
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}


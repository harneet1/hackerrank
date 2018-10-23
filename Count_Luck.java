import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Cell
    {
        int x;
        int y;
        ArrayList<String> list = new ArrayList<>();
        Cell(int x, int y, ArrayList list)
        {
            this.x = x;
            this.y = y;
            this.list = list;
        }
    }

public class Solution {
    
    static int count(int initialX, int initialY, String[] matrix, ArrayList list)
    {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        String[] dir = {"U", "L", "D", "R"};
        int finalCount = 0;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length()];
        visited[initialX][initialY] = true;
        for(int i = 0; i < list.size(); i++)
        {
            int count1 = 0;
            for(int j = 0; j < 4; j++)
            {
                int c = initialX + dx[j];
                int d = initialY + dy[j];
                if(inside(c, d, matrix.length, matrix[0].length(), matrix) && (!visited[c][d]))
                {
                    visited[c][d] = true;
                    count1++;
                }
                    
            }
            if(count1 >= 2)
                finalCount++;
            if(list.get(i) == "U")
            {
                initialX = initialX - 1;
                initialY = initialY;
            }
            if(list.get(i) == "L")
            {
                initialX = initialX;
                initialY = initialY - 1;
            }
            if(list.get(i) == "D")
            {
                initialX = initialX + 1;
                initialY = initialY;
            }
            if(list.get(i) == "R")
            {
                initialX = initialX;
                initialY = initialY + 1;
            }
        }
        return finalCount;
    }
    
    
    
    
    
    static boolean inside(int x, int y, int m, int n, String[] matrix)
    {
        if((x >= 0) && (x < m) && (y >= 0) && (y < n) && ((matrix[x].charAt(y) == '.') || (matrix[x].charAt(y) == '*')))
            return true;
        return false;
    }

    
    static String countLuck(String[] matrix, int k) {
        
        int initialX = 0;
        int initialY = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length(); j++)
            {
                if(matrix[i].charAt(j) == 'M')
                {
                    initialX = i;
                    initialY = j;
                }
            }
        }
        
        int finalX = 0;
        int finalY = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length(); j++)
            {
                if(matrix[i].charAt(j) == '*')
                {
                    finalX = i;
                    finalY = j;
                }
            }
        }
        
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        String[] dir = {"U", "L", "D", "R"};
        
        boolean[][] visited = new boolean[matrix.length][matrix[0].length()];
        Stack<Cell> s = new Stack<Cell>();
        ArrayList<String> list = new ArrayList<>();
        s.push(new Cell(initialX, initialY, list));
        
        while(!s.isEmpty())
        {
            Cell t = s.peek();
            s.pop();
            
            if((t.x == finalX) && (t.y == finalY))
            {
                int count2 = count(initialX, initialY, matrix, t.list);
                //System.out.println(t.list);
                String str1 = "Impressed";
                String str2 = "Oops!";
                System.out.println(count2);
                if(count2 == k)
                    return str1;
                return str2;
                    
                //break;
            }
            
            for(int i = 0; i < 4; i++)
            {
                int c = t.x + dx[i];
                int d = t.y + dy[i];
                ArrayList<String> list1 = t.list;
                
                if(inside(c, d, matrix.length, matrix[0].length(), matrix) && (!visited[c][d]))
                {
                    //System.out.println(matrix[c].charAt(d));
                    ArrayList<String> list2 = new ArrayList<>();
                    list2.addAll(list1);
                    list2.add(dir[i]);
                    visited[c][d] = true;
                    s.push(new Cell(c, d, list2));                    
                }        
            }
        }
        String str = "Impressed";
        return str;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            String[] matrix = new String[n];

            for (int i = 0; i < n; i++) {
                String matrixItem = scanner.nextLine();
                matrix[i] = matrixItem;
            }

            int k = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = countLuck(matrix, k);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


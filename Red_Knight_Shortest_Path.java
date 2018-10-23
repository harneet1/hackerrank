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
    int dis;
    String dir;
    ArrayList<String> list = new ArrayList<>();
    Cell(int x, int y, int dis, String a, ArrayList list)
    {
        this.x = x;
        this.y = y;
        this.dis = dis;
        this.dir = a;
        this.list = list;
    }
}
public class Main {

    static boolean inside(int x, int y, int n)
    {
        if((x >= 0) && (x < n) && (y >= 0) && (y < n))
            return true;
        return false;
    }

    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {

        int[] dx = {-2, -2, 0, 2, 2, 0};
        int[] dy = {-1, 1, 2, 1, -1, -2};
        String[] dir = {"UL", "UR", "R", "LR", "LL", "L"};
        Queue<Cell> q = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        q.add(new Cell(i_start, j_start, 0, "", list));
        boolean[][] visited = new boolean[n][n];
        //List<String> list = new LinkedList<>();
        int flag = 0;
        while(!q.isEmpty())
        {
            Cell t = q.peek();
            q.remove();
            if((t.x == i_end) && (t.y == j_end))
            {
                System.out.println(t.dis);
                for(int i = 0; i < t.list.size(); i++)
                {
                    System.out.print(t.list.get(i));
                    System.out.print(" ");
                }
                flag = 1;
                break;
            }
            //
            //System.out.println(t.list);

            for(int i = 0; i < 6; i++)
            {
                int c = t.x + dx[i];
                int d = t.y + dy[i];
                ArrayList<String> list1 = t.list;



                if(inside(c, d, n) && (!visited[c][d]))
                {
                    ArrayList<String> list2 = new ArrayList<>();
                    list2.addAll(list1);
                    list2.add(dir[i]);
                    visited[c][d] = true;
                    q.add(new Cell(c, d, t.dis+1, dir[i], list2));
                    //System.out.println(q.peek().list);

                }

            }
        }
        //System.out.println(list);
        if(flag == 0)
            System.out.println("Impossible");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] i_startJ_start = scanner.nextLine().split(" ");

        int i_start = Integer.parseInt(i_startJ_start[0]);

        int j_start = Integer.parseInt(i_startJ_start[1]);

        int i_end = Integer.parseInt(i_startJ_start[2]);

        int j_end = Integer.parseInt(i_startJ_start[3]);

        printShortestPath(n, i_start, j_start, i_end, j_end);

        scanner.close();
    }
}




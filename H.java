package Contest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class H {
    static Scanner cin = null;
    static {
        try {
            cin = new Scanner(new File("H.txt"));
        } catch (FileNotFoundException e) {
            cin = new Scanner(System.in);
        }
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<n;i++)
            q.offer(cin.nextInt());
        int count = 0;
        while(!q.isEmpty())
        {
            int a = q.peek();
            q.poll();
            if(q.isEmpty())
            {
                break;
            }
            int b = q.peek();
            q.poll();
            count+=a+b;
            q.offer(a+b);
        }
        System.out.println(count);
    }
}

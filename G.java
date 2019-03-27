package Contest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class G {
    static int [] a = {100,50,20,10,5,2,1};
        static Scanner cin = null;
        static {
            try{
                cin = new Scanner(new File("G.txt"));
            }
            catch(FileNotFoundException e)
        {
            cin = new Scanner(System.in);
        }
    }

    public static void main(String[] args) {
        while(cin.hasNext()) {
            int n = cin.nextInt();
            if(n==0)
                return;
            int [] arr = new int[n];
            int temp = 0;
            for(int i = 0;i<n;i++) {
                arr[i] = cin.nextInt();
                temp += count(arr[i]);
            }
            System.out.println(temp);
        }
    }
    static int count(int k)
    {
        int temp = 0;
        for(int i=0;i<a.length;i++)
        {
            if(k>=a[i])
            {
                int t1 = k/a[i];
                temp+=t1;
                k = k - t1*a[i];
            }
        }

        return temp;
    }
}

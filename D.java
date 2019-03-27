package Contest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D {
    static Scanner cin = null;
    static {
        try{
             cin = new Scanner(new File("D.txt"));
        }
        catch(FileNotFoundException e)
        {
            cin = new Scanner(System.in);
        }
    }
    public static void main(String[] args) {
        while(cin.hasNext())
        {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int t = a*100;
            if(a==0&&b==0)
                return;
            for(int i = 0 ;i<100;i++)
            {
                int temp = t+i;
                if(temp%b==0)
                {
                    if(i<10)
                    System.out.println("0"+i);
                    else
                        System.out.println(i);
                    i=i+b-1;
                }
            }
        }
    }
}

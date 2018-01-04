import java.util.*;
public class high_small_n
{
    public static void main()
    {int h,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input n");
        int n=sc.nextInt();
        System.out.println("Input Numbers");
        int y=sc.nextInt();
        h=y;
        s=y;
        
        for(int i=2;i<=n;i++)
        {
            int x=sc.nextInt();
            if(x>h)
            h=x;
            if(x<s)
            s=x;
        }
        System.out.println("Highest : " +h);
        System.out.println("Smallest : " +s);
    }
}
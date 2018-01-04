 import java.util.*;
class sum_avg_n
{
    public static void main()
    { int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" numbers:");
        for(int i=1;i<=n;i++)
        {
            int x=sc.nextInt();

             s=s+x;
        }
        float avg=s/n;
        System.out.println("Sum: "+s);
        System.out.println("Average: "+avg);
    }
}
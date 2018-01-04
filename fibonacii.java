import java.util.*;
public class fibonacii
{
    public static void main()
    { int a=0,b=1,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Set limit ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            a=b;
            b=c;
            System.out.print(c+ " ");
            c=a+b;
            if(c>n)
            break;
        }
    }
}
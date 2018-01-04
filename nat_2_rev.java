import java.util.*;
public class nat_2_rev
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            int t=a;
            a=b;
            b=t;
        }
       
        while(b>=a)
        {
            System.out.print(b+ " ");
            b--;
        }
    }
}
        
       
    
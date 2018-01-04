import java.util.*;
public class nat_2
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
        while(a<=b)
        {
            System.out.print(a+ " ");
            a++;
        }
    }
}
        
       
    
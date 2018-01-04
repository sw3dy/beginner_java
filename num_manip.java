import java.util.*;
public class num_manip
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: " );
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        System.out.println("SUM:"+(a+b));
        else if(a>b)
        System.out.println("REMAINDER:"+(a%b));
        else
        System.out.println("PRODUCT:" + (a*b));
    }
}
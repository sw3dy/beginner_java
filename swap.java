import java.util.*;
public class swap
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A:");
        int a=sc.nextInt();
        System.out.println("ENTER B:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }
}
        
import java.util.*;
public class SimpleIntrest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Principal:");
        float p=sc.nextFloat();
        System.out.println("Rate:");
        float r=sc.nextFloat();
        System.out.println("Time: ");
        int t=sc.nextInt();
        float si=(p*r*t)/100;
        System.out.println("Simple Intrest: "+si);
    }
}
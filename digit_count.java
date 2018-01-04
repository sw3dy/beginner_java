import java.util.*;
public class digit_count
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer");
       
       int a=sc.nextInt();
      int m=a;
       int i=0;
        int d=0;
       while(a>0)
       {
           d=a%10;
           i++;
           a=a/10;
        }
       if(i<=3)
        System.out.println(i+" digit number.");
        else
System.out.println(m+" is not a single/double/triple digit number");
    }
}

        

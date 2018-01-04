import java.util.*;
class sum_digits
{
    public static void main()
    {int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
       while(n>0)
       {
            int d=n%10;
           s=s+d;
           n=n/10;
        }
        System.out.println("Sum Of The Digits: "+s);
    }
}
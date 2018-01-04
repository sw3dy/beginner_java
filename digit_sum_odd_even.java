import java.util.*;
class digit_sum_odd_even
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
       int n=sc.nextInt();
       int m=n; 
       int ev=0;
       int od=0;
       while(n>0)
       {
           int d=n%10;
           if(d%2==0)
           ev=ev+d;
           else
           od=od+d;
           n=n/10;
        }
        System.out.println("Sum of Even Digits: "+ev);
        System.out.println("Sum of Odd Digits: "+od);
    }
}
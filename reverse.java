import java.util.*;
class reverse
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        int m=n; int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }

        System.out.println("Original Number: "+m);
 System.out.println("Reversed Number: "+rev);
}
}
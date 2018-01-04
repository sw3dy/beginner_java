import java.util.*;
class hcf
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            int t=a;
            a=b;
            b=t;
        }
for(int i=a;i>=1;i--)
{
if(a%i==0 && b%i==0)
{System.out.println("Hcf: "+i);
break;
}
}
}
}
import java.util.*;
class lcm
{
    public static void main()
    { int hcf=1;
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
{hcf=i;
break;
}
}
int lcm=(a*b)/hcf;
System.out.println("LCM: "+lcm);
}
}
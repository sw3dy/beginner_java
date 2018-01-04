import java.util.*;
class prime_range
{
    public int prime(int n)
{ int f=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        f++;
    }
if (f==2)
return 1;
else
return 0;
}
public void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Range");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if (a>b)
    {
        int t=a;
        a=b;
        b=t;
    }
    for(int i=a;i<=b;i++)
    {
if(prime(i)==1)
System.out.println(i);
}
}
}

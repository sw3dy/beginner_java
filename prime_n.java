import java.util.*;
public class prime_n
{
    public static void main()
    {
Scanner sc=new Scanner(System.in);
System.out.println("Input N");
int n=sc.nextInt(); int k=0;
System.out.println("Input "+n+" numbers:");
for(int i=1;i<=n;i++)
{ int p=0;
    int x=sc.nextInt();
    for(int j=1;j<=x;j++)
    {
        if(x%j==0)
        p++;
        
    }
    if(p==2)
    k++;
}
System.out.println("No Of Prime Numbers: "+k);
}
}

        
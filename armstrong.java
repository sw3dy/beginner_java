import java.util.*;
class armstrong
{
public static void main()
{long s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Number");
int n=sc.nextInt();
int m=n;
while(n>0)
{
    int d=n%10;
    s=s+(d*d*d);
    n=n/10;
}
if(s==m)
System.out.println(m+" is a armstrong number.");
else
System.out.println(m+" is not a armstrong number.");
}
}

    
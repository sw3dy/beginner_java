import java.util.*;
public class q4a
{
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
int a=-1,b=1;
int c=a+b;
while(i<=n)
{
	System.out.print(c+" ");
	a=b;
	b=c;
	c=a+b;
	i++;
}
}
}
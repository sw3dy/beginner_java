import java.util.*;
class q5b
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		int hcf=0;
		if(a>b)
		{
         a=a+b;
        b=a-b;
        a=a-b;
		}
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("HCF:"+hcf);
	}
}
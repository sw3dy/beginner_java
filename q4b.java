import java.util.*;
class q4b
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				c++;

		}
		if(c==0)
		{
			System.out.println(n+" is a prime number.");

		}
		else
		{
			System.out.println(n+" is a composite number.");
		}
	}
}
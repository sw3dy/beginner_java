import java.util.*;
class q4c
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s=s+i;

			}

		}

		if(s==n)
			System.out.println(n+" is perfect number.");
		else
			System.out.println(n+" is not a perfect number.");
	}
}
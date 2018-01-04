import java.util.*;
class q6b
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
           a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-1);j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
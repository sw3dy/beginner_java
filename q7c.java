import java.util.*;
class q7c
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{  
			for(int j=0;j<3;j++)
			{
            for(int k=0;k<3;k++)
            {
            	c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
            }
			}
			
		}
		q7c ob=new q7c();
		ob.display(a);
		ob.display(b);
		ob.display(c);
	}
	void display(int a[][])
	{
     for(int i=0;i<3;i++)
     { System.out.println();
     	for(int j=0;j<3;j++)
     	{
     		System.out.print(a[i][j]+" ");
     	}
     }
	}
}
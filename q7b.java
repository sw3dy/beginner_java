import java.util.*;
class q7b
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[][]=new int[2][3];
		int m[][]=new int[2][3];
		int s[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{ 
			for(int j=0;j<3;j++)
		{
			n[i][j]=sc.nextInt();
			m[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<2;i++)
		{ 
			for(int j=0;j<3;j++)
		{ s[i][j]=n[i][j]+m[i][j];


	}
}
for(int i=0;i<2;i++)

		{   System.out.println();
			for(int j=0;j<3;j++)
		{ System.out.print(s[i][j]+" ");
		

	}
}
}
}
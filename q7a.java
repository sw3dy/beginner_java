import java.util.*;
class q7a
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int r=sc.nextInt();
		System.out.println("Enter Coloumns: ");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{System.out.println("Enter"+(i+1)+","+(j+1)+"th term");
              a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
             System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Prime Matrix: ");
		for(int i=0;i<r;i++)
{ System.out.println();
	for (int j=0;j<c;j++) 
	{
 int p=0;
	for(int k=2;k<a[i][j];k++)
    {
    	if(a[i][j]%k==0)
    		p++;
    }
    if(p==0)
    	System.out.print(a[i][j]+" ");
    else
    	System.out.print("  ");
	
}

		}
	}
}
import java.util.*;
class q6c{
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String na[]=new String[n];
		String r[]=new String[n];
		String b[]=new String[n];
		String t[]=new String[n];
		for(int i=0;i<n;i++)
		{
			na[i]=sc.nextLine();
			r[i]=sc.nextLine();
			b[i]=sc.nextLine();
			t[i]=sc.nextLine();
}
for(int i=0;i<n;i++)
{   System.out.println(i+1);
	System.out.println("Name: "+na[i]);
	System.out.println("Roll: "+r[i]);
	System.out.println("Branch: "+b[i]);
	System.out.println("Total Marks: "+t[i]);


	}
}
}
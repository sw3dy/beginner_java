import java.util.*;
class q6a
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		int n=sc.nextInt();
        int a[]=new int[n];
a[0]=sc.nextInt();
int h=a[0]; int l=a[0];
        for(int i=1;i<n;i++)
        {
        	a[i]=sc.nextInt();
        	if(a[i]>h)
        		h=a[i];
        	if(a[i]<l)
        		l=a[i];
        }
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Highest: "+h);
        System.out.println("Lowest: "+l);

	}
}
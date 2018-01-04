import java.util.*;
class arr_3
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter N");
int b=0,l=999999999;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
    if(a[i]>b)
    b=a[i];
    if(a[i]<l)
    l=a[i];
   
}
System.out.println();
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");

}
System.out.println();
System.out.println("Biggest: "+b);
System.out.println("Smallest: "+l);
}
}



import java.util.*;
public class arr_prime
{
public int prime(int n)
{int c=0;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        c++;
    }
    if(c==0)
    return 1;
    else
    return 0;
}
public void main()
{ int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n: ");
int n=sc.nextInt();
System.out.println("Enter numbers: ");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
     arr[i]=sc.nextInt();
}
System.out.print("prime numbers: ");
for(int j=0;j<n;j++)
   { 
if(prime(arr[j])==1)
{
System.out.print(arr[j]+" ");
c++;
}
}
System.out.println("total prime numbers: "+ c);
}
}
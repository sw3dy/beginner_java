import java.util.*;
class arr_2
{
    public static void main(){
Scanner sc=new Scanner(System.in);
int a[]=new int [10];
System.out.println("Enter 10 numbers: ");
for(int i=0;i<10;i++)
{
 a[i]=sc.nextInt();

}
int s=0; float avg;
System.out.println();
for(int i=0;i<10;i++)
{
System.out.print(a[i]+" ");
s=s+a[i];

}
avg=s/10;
System.out.println("Sum: "+s);
System.out.println("Average: "+avg);
}
}

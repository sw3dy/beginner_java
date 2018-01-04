import java.util.*;
class q3e
{
	public static void main(String ar[]) throws InputMismatchException
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.print("The license fees: Rs");
	if(a>=50 && a<=60)
		System.out.print("1000");
	else if(a>=40 && a<=49)
		System.out.print("1500");
	else if(a>=30 && a<=39)
		System.out.print("2000");
	else if(a>18 && a<=29)
		System.out.print("3000");
	else
		System.out.print("NA");
}
}
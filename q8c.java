import java.util.*;
class q8c
{
	double a,b;
	void input(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void out()
	{
		System.out.println("Sum: "+(a+b));
		System.out.println("Difference: "+(a-b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		q8c ob=new q8c();
		int a=sc.nextInt();
		int b=sc.nextInt()
		ob.input(a,b);
		ob.out();
	}
}
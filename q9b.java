class q9b
{

void area(int a,int b)
{
 int ar=a*b;
 System.out.println("Area="+ar);
}
void area(int a)
{
 int ar=(22/7)*a*a;
 System.out.println("Area="+ar);
}
void area(double a,double b)
{
 double ar=(0.5)*a*b;
 System.out.println("Area="+ar);
}
public static void main(String[] args) {
	q9b ob=new q9b();
	ob.area(5);
	ob.area(2.0,3.0);
	ob.area(2,8);
}
}
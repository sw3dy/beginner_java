import java.util.*;
class q10a
{
 int real,img;
 	void assign(int r,int i)
 	{
 		real=r;
 		img=i;
 	}
 	void display()
 	{
 		System.out.println("Real Part: "+real);
        System.out.println("Imaginary Part: "+img);
 	}
 	void Add(q10a A,q10a B)
     {
     	
     	real=A.real+B.real;
     	img=A.img+B.img;
     }
 	void Sub(q10a A,q10a B)
     {
     
     	real=A.real-B.real;
     	img=A.img-B.img;
     }
     public static void main(String[] args) {
     	Scanner sc=new Scanner(System.in);
     	int r=sc.nextInt();
     	int i=sc.nextInt();
     	q10a a=new q10a();
     	a.assign(r,i);
     	q10a b=new q10a();
     	r=sc.nextInt();
        i=sc.nextInt();
        b.assign(r,i);
    	q10a c=new q10a();
    	q10a d=new q10a();
        c.Add(a,b);
        d.Sub(a,b);
      a.display();
      b.display();
      c.display();
      d.display();
     }
}
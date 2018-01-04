import java.util.*;
class q8b
{ int trainNumber,bogieNumber,berthNumber,passengerId;
  void set(int t,int b,int bn,int p)
  {
  	trainNumber=t;
  	bogieNumber=b;
  	berthNumber=bn;
  	passengerId=p;
  }
  void display()
  {
  	System.out.println(trainNumber);
  	System.out.println(bogieNumber);
  	System.out.println(berthNumber);
  	System.out.println(passengerId);
  }
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	int t=sc.nextInt();
  	int b=sc.nextInt();
  	int bn=sc.nextInt();
  	int p=sc.nextInt();
  	q8b ob=new q8b();
  	ob.set(t,b,bn,p);
  	ob.display();

  }
}
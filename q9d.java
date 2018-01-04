import java.util.*;
class q9d
{ 
   String name,gender,post,salary;
   void accept(String n,String g,String p,String s)
   {
    name=n;
    gender=g;
    post=p;
    salary=s;
   }
   void display()
   {
   	System.out.println("Name :"+name);
   	System.out.println("Gender :"+gender);
   	System.out.println("Post :"+post);
   	System.out.println("Salary :"+salary);
   }
   public static void main(String[] args) {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("Enter n:");
    int n=sc.nextInt();

    q9d ob[]=new q9d[n];

    for(int i=0;i<n;i++)
    {
    System.out.println("Enter name:");
    String na=sc.nextLine();
    System.out.println("Enter Gender:");
    String g=sc.nextLine();
    System.out.println("Enter Post:");
    String p=sc.nextLine();
    System.out.println("Enter Salary:");
    String s=sc.nextLine();
     q9d t=new q9d();
     t.accept(na,g,p,s);
   ob[i]=t;
    }
    for(int i=0;i<n;i++)
{
	ob[i].display();
}
   	   }
}
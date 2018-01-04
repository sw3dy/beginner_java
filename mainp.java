import java.util.*;
class mainp
{
public static void main() 
{
    Scanner sc=new Scanner(System.in);
    student ob1=new student();
    String n=sc.nextLine();
    int r=sc.nextInt();
    int tot=sc.nextInt();
    ob1.accept(n,r,tot);
    ob1.display();
}
}
  

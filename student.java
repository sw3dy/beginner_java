import java.util.*;
public class student
{
    String name;
    int roll;
    int total;
    
   void accept(String n,int r,int tot)
   {
       name=n;
       roll=r;
       total=tot;
  
    }
void display()
{
System.out.println("Name: " +name);
System.out.println("Roll: " +roll);
System.out.println("Total marks: " +total);
}
}

       
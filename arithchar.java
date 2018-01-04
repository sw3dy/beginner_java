import java.io.*;
public class arithchar
{
   public static void main() throws IOException
   {
       DataInputStream sc=new DataInputStream(System.in);
       System.out.println("Enter a valid operator : ");
       char ch=sc.readLine().charAt(0);
       if(ch=='+')
       System.out.println("addition");
       else if(ch=='-')
       System.out.println("subtraction");
       else if(ch=='*')
       System.out.println("multiplication");
       else if(ch=='/')
       System.out.println("division");
       else if(ch=='%')
       System.out.println("modulo division");
       else
       System.out.println("Wrong Input");
    }
}
       
      
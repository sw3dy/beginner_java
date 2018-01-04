import java.util.*;
class q3c
{
	public static void main(String args[]) throws InputMismatchException
	{
     Scanner sc=new Scanner(System.in);
     char ch=sc.nextLine().charAt(0);
     if(ch=='+')
     System.out.println("Addition");
 else if(ch=='-')
 	System.out.println("Subtraction");
 else if(ch=='*')
 	System.out.println("Multiplication");
 else if(ch=='/')
 	System.out.println("Division");
 else if(ch=='%')
 	System.out.println("ModuloDivision");
 else
 	System.out.println("Wrong Input");
}
}
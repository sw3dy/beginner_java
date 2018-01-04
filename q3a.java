import java.util.*;
class q3a
{
	public static void main(String args[]) throws InputMismatchException
	{
 Scanner sc=new Scanner(System.in);
 char c=sc.nextLine().charAt(0);
 char ch=Character.toUpperCase(c);
 if(ch=='A'||ch=='E'||ch== 'I'||ch=='O'||ch=='U')
 System.out.println(c+" is a Vowel");
	else 
		System.out.println(c+" is a Consonant");

}
}
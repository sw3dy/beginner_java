import java.util.*;
class q2c
{
	public static void main(String args[]) 
	{
	Scanner sc=new Scanner(System.in);
	float Principal=sc.nextFloat();
	float Rate=sc.nextFloat();
	float Time=sc.nextFloat();
	float SI=(Principal*Rate*Time)/100;
	float Amount=Principal+SI;
	System.out.println("Simple Intrest="+SI);
	System.out.println("Amount="+Amount);
	}
}
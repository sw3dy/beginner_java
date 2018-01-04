import java.util.*;
class q5d
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int l=n.length();
		int up=0;int lp=0;
		for(int i=0;i<l;i++)
		{
			char c=n.charAt(i);
			if(c>=65 && c<=90)
				up++;
			if(c>=97 && c<=122)
				lp++;
}
System.out.println("Upper Case : "+up);
System.out.println("Lower Case : "+lp);
	}
}
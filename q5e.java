import java.util.*;
class q5e
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int f=0;
		
		n=n.trim();

		int l=n.length();
		for(int i=0;i<l;i++)
		{
char ch=n.charAt(i);
if(ch==' ')
{
f++;
}

}
System.out.println("No. of words: "+(f+1));
	}
}
class q4e
{
	public static int fact(int n)
	{
		int f=1;
		for(int i=2;i<=n;i++)
			f=f*i;
		return f;
	}
	public static void main(String[] args) {
		int m=0;
		for(int i=0;i<=10;i++)
		{
         m=(fact(i+1))/(i+1);
         System.out.println(i+"! = "+m);
		}
	}
}
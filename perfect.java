import java.util.*;
class perfect
{
    public static void main()
    { int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if (s==n)
        System.out.println(n+" is a perfect number.");
        else
        System.out.println(n+" is not a perfect number.");
    }}
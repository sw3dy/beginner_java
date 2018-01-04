import java.util.*;
class n_evn_odd
{
    public static void main()
    { int e=0,o=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" numbers:");
        for(int i=1;i<=n;i++)
        {
            int x=sc.nextInt();
            if(x%2==0)
                e++;
            else
                o++;
        }
        System.out.println("Total odd numbers : "+o);
        System.out.println("Total even numbers : "+e);
    }
}
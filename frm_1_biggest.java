import java.util.*;
public class frm_1_biggest
{
    public static void main()
    {int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int h=0;
        if(a>b && a>c)
        h=a;
        else if(b>c && b>a)
        h=b;
        else if(c>a && c>b)
        h=c;
        while(i<=h)
        {
            System.out.print(i+ " ");
            i++;
        }}
    }
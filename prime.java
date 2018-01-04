import java.util.*;
class prime
{
    public static void main()
    { int f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int l=sc.nextInt();

        for(int i=2;i<l;i++)
        {
            if(l%i==0)
            {f=1;
                break;
            }
        }
        if(f==0)
            System.out.println(l+" is a prime number");
        else
            System.out.println(l+" is a composite number");
    }
}

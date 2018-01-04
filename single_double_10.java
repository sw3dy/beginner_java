import java.util.*;
class single_double_10
{
    public static void main()
    { int si=0;
        int dou=0; 
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=1;i<=10;i++){
            int n=sc.nextInt();
            while(n>0)
            {
                int d=n%10;
                c++;
                n=n/10;
            } 
            if(c==1)
            si++;
            else if(c==2)
            dou++;
            c=0;
        }
            System.out.println("No of Single Digits: "+si);
            System.out.println("No of Double Digits: "+dou);
        }
    }
    
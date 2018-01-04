import java.util.*;
class factorial
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int i=sc.nextInt();
int f=1;
    for(int m=1;m<=i;m++)
    { f=f*m;
    }
    System.out.println(i+"! ="+f);
}
}

        
        
import java.util.*;
public class driver_license
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        int a=sc.nextInt();
        System.out.println();
        System.out.print("the license fees is ");
        if(a>=50 && a<=60)
            System.out.print("1000");
        else if(a>=40 && a<=49)
                System.out.print("1500");
         else if (a>=30 && a<=39)
        System.out.print("2000"); 
else if (a>=18 && a<=29)      
System.out.print("3000");
else
System.out.print("You Are Under Age");
}
}

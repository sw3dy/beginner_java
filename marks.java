import java.util.*;
public class marks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String name=sc.nextLine();
                System.out.println("Roll:");
                int roll=sc.nextInt();
                System.out.println("Enter marks of 4 subjects:");
                int m1=sc.nextInt();
                int m2=sc.nextInt();
                int m3=sc.nextInt();
                int m4=sc.nextInt();
                int total=m1+m2+m3+m4;
                float avg=total/4;
                System.out.println("Total marks: "+total);
                System.out.println("Average marks: "+avg);
                
    }}
    
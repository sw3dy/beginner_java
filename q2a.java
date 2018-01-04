import java.util.*;
class q2a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int roll=sc.nextInt();
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float m4=sc.nextFloat();
        float tot=m1+m2+m3+m4;
        float avg=tot/4;
        System.out.println("Name="+name);
        System.out.println("roll="+roll);
        System.out.println("Total marks="+tot);
        System.out.println("Average Marks="+avg);
    }
}
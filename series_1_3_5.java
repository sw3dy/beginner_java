import java.util.*;
public class series_1_3_5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
    }
}
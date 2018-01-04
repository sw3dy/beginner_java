import java.util.*;
public class nat_n_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int b=sc.nextInt();
       
       while(b>=2)
        {
            System.out.print(b+ " ");
            b=b-2;
        }
        if(b%2!=0)
        System.out.print("2");
    }
}
        
       
    
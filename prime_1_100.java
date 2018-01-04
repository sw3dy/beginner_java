import java.util.*;
class prime_1_100
{
    public static void main()
    {   for(int l=2;l<=100;l++)
        {
        int f=0;
        
        for(int i=2;i<l;i++)
        {
            if(l%i==0)
            {f=1;
                break;
            }
        }
        if(f==0)
            System.out.print(l+" ");
       
    }
}
}

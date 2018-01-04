import java.util.*;
class reverse_100_120
{
    public static void main()
    {
       for(int x=100;x<=120;x++)
       {
           
        int m=x; int q=m; int n=m; int c=0; double rev=0;
        while(m>0)
        {
            int d=m%10;
            c++;
            m=m/10;
        }
        
        while(n>0)
        {
           int d=n%10;
            rev=rev+(d*Math.pow(10,c-1));
            c--;
            n=n/10;
        }
        System.out.println(q+ " " + (int)rev);
}
}
}
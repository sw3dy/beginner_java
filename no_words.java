import java.util.*;
public class no_words
{
    public static void main()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String n=sc.nextLine();
        int l=n.length();
        int wn=0;
        for(int i=0;i<l;i++)
        {
            char ch=n.charAt(i);
            if(ch==' ')
            wn++;
        }
       
        System.out.println("No of Words: "+(wn+1));
        
    }
    }
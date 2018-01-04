import java.util.*;
class selection_sort
{
    public void selection(int a[])
    {
        int l=a.length;
        for(int i=0;i<l;i++)
        {
            int in=i;
            for(int j=i+1;j<l;j++)
            {
                if(a[j]<a[in])
                {
                    in=j;
                }
                }
                int sm=a[in];
                a[in]=a[i];
                a[i]=sm;
            }
                
    }

    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int n=sc.nextInt();
        int p[]=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(p[i]+" ");

        }
        selection(p);
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(p[i]+" ");
        }
    }
}

        
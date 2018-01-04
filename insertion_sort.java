import java.util.*;
class insertion_sort
{
    public void insertion(int a[])
    {
        int l=a.length;
        int t,j;
        for(int i=1;i<l;i++)
        {
        j=i;
        t=a[i];
        while(j>0 && t<a[j-1])
        {
            a[j]=a[j-1];
            j=j-1;
            }
            a[j]=t;
                
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
        insertion(p);
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(p[i]+" ");
        }
    }
}

        
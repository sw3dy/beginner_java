import java.util.*;
class bubble_sort
{
    public void bubble(int a[])
    {
        int l=a.length;
        int t=0;
        for(int i=0;i<l;i++)
        {
            for(int j=1;j<l;j++)
            {
                if(a[j-1]>a[j])
                {
                    t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
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
        bubble(p);
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(p[i]+" ");
        }
    }
}

        
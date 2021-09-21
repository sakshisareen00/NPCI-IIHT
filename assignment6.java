import java.io.*;
class myclass
{
    public static void main(String[] args)
    {
        int a[]= new int[15];
        a[0]=0;
        a[1]=1;
        int n=15;
        for(int i=2;i<n;i++)
        {
            a[i]=a[i-2]+a[i-1];
        }
        for(int i =n-1;i>=0;i--)
        {
            System.out.print(a[i]+ " ");
            
        }
    }
    
    
}


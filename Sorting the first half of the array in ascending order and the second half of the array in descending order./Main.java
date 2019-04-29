import java.util.*;
class Main
{
  public static void main(String args[])
  {
Scanner s= new Scanner(System.in);
    int x= s.nextInt();
    int[] a= new int[x];
    int i,j,temp;
    for(i=0;i<x;i++)
    a[i]=s.nextInt();
    for(i=0;i<x/2-1;i++)
    {
     for(j=1;j<x/2;j++)
     {
       if(a[i]>a[j])
       {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
       }
     }
    }
      for(i=x-2;i>x/2-1;i--)
    {
     for(j=x-1;j>=x/2;j--)
     {
       if(a[i]<a[j])
       {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
       }
     }
    }
    for(i=0;i<x;i++)
      System.out.print(a[i]+" ");
        
  }
}
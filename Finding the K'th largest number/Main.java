import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
Scanner s= new Scanner(System.in);
      int x= s.nextInt();
      int[] a=new int[x];
      int i,j,min,p=0;
      for(i=0;i<x;i++)
      {
        a[i]=s.nextInt();
           }
      int k=s.nextInt();
    
      for(i=0;i<x;i++)
      {
          min=a[i];
        p=i;
        for(j=i+1;j<x;j++)
        {
          if(a[j]<min)
          {
            min=a[j];
            p=j;
    }
        }
        a[p]=a[i];
        a[i]=min;
            }
 
   System.out.println(a[x-k]);
    }
}
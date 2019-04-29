import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner s= new Scanner(System.in);
    int x= s.nextInt();
    int[] a=new int[x];
     int[] sum=new int[x];
    int k=0,max,j=1,i;
    for(i=0;i<x;i++)
    {
      a[i]=s.nextInt();
   }
    sum[k]+=a[0];
    for( i=0;i<x && j<x;i++)
    {
      if(a[j]>=a[i])
      {
        sum[k]+=a[j];
         }
        else 
      {
          k++;
          sum[k]+=a[j];
           }
      j++;
    }
    max=sum[0];
     for( i=1;i<x;i++)
    {
       if(sum[i]>max)
         max=sum[i];
     }
    System.out.println(max);
  }
}
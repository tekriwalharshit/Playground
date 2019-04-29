import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner s= new Scanner(System.in);
    int x= s.nextInt();
    int[] a=new int[x];
     int[][] sum=new int[x][2];
    int max,i,j,ans=0,k=0,f;
    for(i=0;i<x;i++)
    {
      f=1;
      a[i]=s.nextInt();
      for(j=0;j<k;j++)
      {
        if(a[i]==sum[j][0])
        {
              sum[j][1]++;
               f=0;          
                }
      }
      if(f!=0){
          sum[k][0]=a[i];
        sum[k][1]++;
        k++;
        }
    }
    max=sum[0][1];
    ans=sum[0][0];
     for( i=1;i<k;i++)
    {
       if(sum[i][1]>max){
         ans=sum[i][0];
         max=sum[i][1];
     }
     }
    System.out.println(ans);
  }
}
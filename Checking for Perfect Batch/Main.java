import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner s = new Scanner(System.in);
    int n= s.nextInt();
    int[] a= new int[n];
    int sum1=0,sum2=0;
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
      if(i<n/2)
        sum1+=a[i];
      else 
        sum2+=a[i];
    }
   if(n%2!=0)
     sum2-=a[n/2];
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else 
      System.out.println("Not a Perfect Batch");
  }
}
  
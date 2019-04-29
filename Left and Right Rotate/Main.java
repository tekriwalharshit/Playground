import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    	int n= s.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int i,j=0,k=0;
    for(i=0;i<n;i++)
       a[i]=s.nextInt();
         int x= s.nextInt();
       while(k<n)
    {
      if(k%2==0)
       i=k+2*x;
      else 
      j=k-2*x;
        if(i>=n)
           i-=n;
         if(j<0)
           j+=n;
       if(i%2!=0)
         i--;
         if(j%2==0)
           j--;         
          if(k%2==0)
         b[i]=a[k++];
         else
         b[j]=a[k++];
        }
    for(i=0;i<n;i++)
      System.out.print(b[i]+" ");
}
}
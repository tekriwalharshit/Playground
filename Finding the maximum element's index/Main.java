import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n= s.nextInt();
    int[] a= new int[n];
    int i,max,maxi=0;
    for( i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    max=a[0];
    for(i=1;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        maxi=i;
  }
}
    System.out.println(maxi);
  }
}
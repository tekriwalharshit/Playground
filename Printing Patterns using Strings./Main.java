import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner s= new Scanner(System.in);
        String str = s.nextLine();
    int x=str.length();
    int a=x;
    int i,j,k;
    
    for(i=x/2;i<x;i++)
    {
      for(k=1;k<a;k++)
     System.out.print(" ");
        for(j=x/2;j<=i;j++)
      {
        System.out.print(str.charAt(j));
          }
      System.out.println();
     a--;      }
        for(i=0;i<x/2;i++)
    {
          for(k=1;k<a;k++)
     System.out.print(" ");
          for(k=x/2;k<x;k++)
            System.out.print(str.charAt(k));
      for(j=0;j<=i;j++)
      {
        System.out.print(str.charAt(j));
          }
      System.out.println();
          a--;
      }
  }
}
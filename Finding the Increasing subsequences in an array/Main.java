import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
    int x= s.nextInt();
    int[]a = new int[x];
    int i,j;
    for(i=0;i<x;i++)
      a[i]=s.nextInt();
    
      for(i=0;i<x-1;i++)
      {
        for(j=i+1;j<x;j++)
        {
          if(a[i]<a[j])
          {
            System.out.print(a[i]+","+a[j]);
                 System.out.println();
        }
        }
        }
  }
}
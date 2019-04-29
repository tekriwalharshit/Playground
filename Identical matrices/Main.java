import java.util.*;
class Main
{
  static int sum=1;
  public static void main(String args[])
  {
   Scanner s = new Scanner (System.in);
    int x= s.nextInt();
    int y=s.nextInt();
    int i,j,c=0;
    int[][] a= new int[x][y];
      int[][] b= new int[x][y];
    for(i=0;i<x;i++)
    {
      for(j=0;j<x;j++)
        a[i][j]=s.nextInt();
    }
       for(i=0;i<x;i++)
    {
      for(j=0;j<x;j++)
        b[i][j]=s.nextInt();
    }
       for(i=0;i<x;i++)
    {
      for(j=0;j<x;j++)
      {
        if(a[i][j]==b[i][j])
           c++;
                }
        }
    if(c==x*x)
      System.out.println("Yes");
    else 
       System.out.println("No");
     
}
}
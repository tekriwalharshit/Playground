import java.util.*;
class Main
{
  static int sum=1;
  public static void main(String args[])
  {
   Scanner s = new Scanner (System.in);
    int x= s.nextInt();
    int y=s.nextInt();
    int i,j,k,c=0;
    int[][] a= new int[x][y];
      int[][] b= new int[x][y];
    for(i=0;i<x;i++)
    {
      for(j=0;j<x;j++)
        a[i][j]=s.nextInt();
    }
     
    for(k=1;k<=x;k++)
    {
      for(i=0;i<x;i++)
    {
      for(j=0;j<x;j++)
      {
        if(j-i==c)
    System.out.print(a[i][j]+" ");
          }
  }
      c++;
}
}
}
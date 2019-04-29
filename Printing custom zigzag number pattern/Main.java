import java.util.Scanner;
class Main {
	public static void main (String[] args){
 Scanner s= new Scanner(System.in);
      int x= s.nextInt();
      int i,j;
      if(x%2==0)
      {
    for(i=1;i<=x;i++)
    {
      for(j=1;j<x;j++)
      System.out.print(i);
      System.out.println(i+1);
      System.out.print(i+2);
      i++;
      for(j=1;j<x;j++)
      System.out.print(i);
      System.out.println("");
    }
      }
      else {
        i=1;
        for(j=1;j<x;j++)
      System.out.print(i);
      System.out.println(i+1);
         for(i=2;i<=x;i++)
    {
      System.out.print(i+1);
      for(j=1;j<x;j++)
      System.out.print(i);
      System.out.println("");
      i++;
      for(j=1;j<x;j++)
      System.out.print(i);
           System.out.println(i+1);
          }
      }
        
    }
}
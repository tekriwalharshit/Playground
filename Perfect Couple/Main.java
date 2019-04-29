import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner s= new Scanner(System.in);
      int x = s.nextInt();
      int i,j;
      int[] a=new int[x];
      for(i=0;i<x;i++)
      a[i]=s.nextInt();
      int value=s.nextInt();
      for( i=0;i<x;i++)
      {
        for(j=i;j<x;j++)
          if(a[i]+a[j]==value)
            System.out.println(a[i]+", "+a[j]);
              }
    }
}
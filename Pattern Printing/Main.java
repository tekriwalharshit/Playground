import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
            int x=s.nextInt();
        int y=s.nextInt();
      int i,j,k;
           for(i=x;i>0;i--)
          {
            for(k=x;k>=i;k--)
             System.out.print(k);
            for(j=i;j>1;j--)
            System.out.print(i);
               System.out.println();
                         }
    }
}
 
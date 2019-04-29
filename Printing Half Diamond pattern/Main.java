import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
      int x = s.nextInt();
     int i,j,k;
      for(i= 1;i<=x;i++)
      {
        for(k=x;k>i;k--)
          System.out.print(" ");
        for(j=1;j<2*i;j++)
        {
           System.out.print("*");
	}
        System.out.println("");
      }
    }
}
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
      int x = s.nextInt();
     int i,j,k;
      for(i= x;i>=1;i--)
      {
         for(j=i;j>=1;j--)
        {
           System.out.print(j);
	}
        System.out.println("");
      }
    }
}
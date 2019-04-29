import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  	int x = in.nextInt();
      int i,j,c=1;
      for (i=1;i<=x;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(c%2==0)
            System.out.print("#");
          else
            System.out.print("*");
          c++;
    }
        System.out.println("");
}}
    }
import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner s = new Scanner(System.in);
      int x= s.nextInt();
      int sum=0;
 for(int i =1;i<=x;i++)
   sum=sum+i;
      System.out.println(sum);
}
}
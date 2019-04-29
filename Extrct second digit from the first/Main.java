import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner s = new Scanner(System.in);
      int x= s.nextInt();
      int a=0;
      while(x>1&&x>10)
      {
        a=x%10;
        x=x/10;
        
      }
         System.out.println(a);
                            
	} 
} 
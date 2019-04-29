import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner s = new Scanner(System.in);
      int x= s.nextInt();
      int sum =0,a=0;
      sum+=x%10;
      while(x>1)
      {a=x%10;
        x=x/10;
        
      }
      sum+=a;
      System.out.println(sum);
                            
	} 
} 
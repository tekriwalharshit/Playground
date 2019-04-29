import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner s = new Scanner(System.in);
      int x= s.nextInt();
      int j,count=0;
      for(int i=2;i<=x;i++)
      {
        for(j=2;j<i;j++)
        {
          if(i%j==0){
            count=1;
          break;
        }
        }
        if(count==0)
       System.out.println(i);
       count=0;        
	} 
    }
}
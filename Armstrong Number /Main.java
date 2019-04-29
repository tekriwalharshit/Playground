import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner s = new Scanner (System.in);
      int x= s.nextInt();
      int ref=x;
      int a=0,sum=0;
      while(x>=1)
      {
        a=x%10;
        sum+=Math.pow(a,3);
          x=x/10;
      }
          if(sum==ref)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
	}
}
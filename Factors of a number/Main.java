import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner s = new Scanner (System.in);
      int x= s.nextInt();
      for(int i=1;i<=x;i++)
        if(x%i==0)
        System.out.println(i);
	}
}
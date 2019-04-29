import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner s = new Scanner (System.in);
      int x= s.nextInt();
      for(int i=1;i<2*x;i+=2)
      {
        System.out.println(i);
	}
    }
}
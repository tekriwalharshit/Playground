import java.util.Scanner;
class Main{
    static int func(int x,int y)
  {
    if(x>y)
      return x;
    else 
      return y;
}
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int a= s.nextInt();
       int b= s.nextInt();
       int c= s.nextInt();
      	  int x = func(a,b);
        int res=func(x,c);
      System.out.println(res);
	}
}

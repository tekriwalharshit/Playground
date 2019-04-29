import java.util.Scanner;
class Main{
    static int func(int x,int y)
  {
      int max,res=0;
    if(x>y){
      max =x;
      x=y;
    }
      else 
      max=y;
      for(int i =1;i<=x;i++)
      {
        if(x%i==0 && max%i==0)
          res=i;
}
      return res;
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

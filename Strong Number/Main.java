import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner s = new Scanner (System.in);
      int x= s.nextInt();
      int sum=0,prod,j,ref=x,a=0;
     while(x>=1)
     {
       a=x%10;
        prod=1;
        for(j=1;j<=a;j++)
          prod*=j;
       sum+=prod;
       x=x/10;
      }
      if(sum==ref)
        System.out.println("Yes");
      else 
        System.out.println("No");
}
}
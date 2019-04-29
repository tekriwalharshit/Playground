import java.util.*;
class Main
{
  static int sum=1;
  public static void main(String args[])
  {
   Scanner s = new Scanner (System.in);
    int x= s.nextInt();
    System.out.println(fact(x));
      }
  public static int fact(int a)
  {
    if(a==1)
      return sum;
    else 
      sum=a*fact(a-1);
    return sum;
    }
}
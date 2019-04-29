import java.util.*;
class Main
{
  static int sum=0;
  public static void main(String args[])
  {
   Scanner s = new Scanner (System.in);
    int x= s.nextInt();
    System.out.println(sum(x));
      }
  public static int sum(int a)
  {
    if(a==0)
      return sum;
    else 
      sum=a+sum(a-1);
    return sum;
    }
}
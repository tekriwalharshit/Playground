import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int count=0;
    for(int i=1;i<=x;i++)
    { count++;
      System.out.print(i);
      if(count==3){
        System.out.print(",");
        count=0;
      }
  
    
    }}}
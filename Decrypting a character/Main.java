import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner s= new Scanner (System.in);
      char c= s.next().charAt(0);
      int x= s.nextInt();
      int n=c;
      n-=x;
      if(c<91&&n<65 || c>96&&n<97)
      n+=26;  
      System.out.println((char)n);
    }
}
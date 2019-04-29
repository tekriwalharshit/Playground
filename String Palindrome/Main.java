import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
      String str =s.nextLine();
      StringBuilder sb= new StringBuilder(str);
      int x=str.length();
      x--;
      int y=str.length();
      int i;
      for(i=0;i<y/2;i++)
      {
        if(str.charAt(i)!=str.charAt(x))
          break;
        x--;
      }
      if(i==y/2)
        System.out.println("Yes");
      else 
        System.out.println("No");
      
    } 
}
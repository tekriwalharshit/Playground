import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
           String x=s.nextLine();
      String y=s.nextLine();
     x=y;
      String[] arr = x.split(" ");    
for ( String ss : arr) {
    System.out.println(ss);
}
    }
}
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
            int x=s.nextInt();
          int y=s.nextInt();
      int prod=1,i=1;
        while(i<=y)
        {
          prod*=x;
          i++;
          
    }
      System.out.println(prod);
}
}
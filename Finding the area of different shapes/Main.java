import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
         Scanner s= new Scanner(System.in);
            int x=s.nextInt();
      int y,z;
             switch(x)
   {
     case 1: 
                  y=s.nextInt();
           System.out.println(y*y);
      break;
     
     case 2: 
                   y=s.nextInt();
           z=s.nextInt();
     System.out.println(y*z);
      break;
     
     case 3: 
                  y=s.nextInt();
         z=s.nextInt();
     System.out.println(y*z/2);
      break;
     
     case 4: 
                   y=s.nextInt();
            System.out.println(3.14*y*y);
      break;
}
    }
}
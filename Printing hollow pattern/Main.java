import java.util.Scanner;
class Main {
	public static void main (String[] args){
 Scanner s= new Scanner(System.in);
      int x= s.nextInt();
        int i, j; 
        for (i = 1; i <= x; i++) 
        { 
            for (j = 1; j <= x; j++) 
            { 
                if (i == 1 || i == x ||  
                    j == 1 || j == x)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        }
    }

}
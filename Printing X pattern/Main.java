import java.util.Scanner;
class Main {
	public static void main (String[] args){
 Scanner s= new Scanner(System.in);
      int size= s.nextInt();
    for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
            if (row == col || row + col == size - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
         
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] spiral = new int[n][n];
        
        int value = 1;
        
        int minCol = 0;
        
        int maxCol = n-1;
        
        int minRow = 0;
        
        int maxRow = n-1;
        
        while (value <= n*n)
        {
               for (int i = maxCol; i >= minCol+1; i--) 
            {
                spiral[minRow][i] = value;
                
                value++;
            }
            for (int i = minRow; i <= maxRow; i++)
            {
                spiral[i][minCol] = value;
                    
                value++;
            }
            
            for (int i = minCol+1; i <= maxCol; i++) 
            { 
                spiral[maxRow][i] = value; 
                
                value++; 
            } 
            
            for (int i = maxRow-1; i > minRow; i--)
            {
                spiral[i][maxCol] = value;
                            
                value++;
            }
            
       
            
            minCol++;
            
            minRow++;
            
            maxCol--;
            
            maxRow--;
        }
        
        
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ " ");
            }
            
            System.out.println();
        }
    }
}
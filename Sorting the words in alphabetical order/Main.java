import java.util.*;
class Main
{
   public static void main(String[] args) 
    {
        int count,i,j;
        String temp;
        Scanner scan = new Scanner(System.in);
           count = scan.nextInt();
         String[] str = new String[count+1];
            
          for(i = 0; i<=count; i++)
        {
            str[i] = scan.nextLine();
        }
             
          for ( i = 0; i <= count; i++) 
        {
            for ( j = i + 1; j <= count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
           for ( i = 1; i <=count ; i++) 
        {
            System.out.println(str[i].toLowerCase());
        }
    }
}
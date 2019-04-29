import java.util.*;
public class Main {
    
    public static void main(String args [])
    
    {
      Scanner s= new Scanner(System.in);
      int x=s.nextInt();
        String result= intToStr(x);
        System.out.println(result);
    }
    
    public static final int MAX_DIGITS = 10;
    public static String intToStr( int num ){
        int i = 0;
        boolean isNegative = false;
    
        char[] temp = new char[ MAX_DIGITS + 1 ];
       
        if( num < 0 ){
            num = -num;
            isNegative = true;
        }
           do {
            temp[i++] = (char)((num % 10) + '0');
            num /= 10;
        } while( num != 0 );
        StringBuilder b = new StringBuilder();
        if( isNegative )
        b.append( '-' );
        while( i > 0 ){
            b.append( temp[--i] );
        }
        return b.toString();
    }
}
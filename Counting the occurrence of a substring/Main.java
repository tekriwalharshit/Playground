import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
      String str =s.nextLine();
      String str2 =s.nextLine();
      int y=str.length();
      int z=str2.length();
      int i,j=0,c=0,count=0,a=0;
      for(i=0;i<y;i++)
      {
        if(str.charAt(i)==str.charAt(j))
        {
                 
          for(j=0;j<z;j++)
          {
            if(str.charAt(0)==str2.charAt(0))
            c++;
            else 
              break;
            i++;
          }
          if(c==z)
          {
            count++;
          }
          j=0;c=0;
               }
      }
        System.out.println(count);
      
    } 
}
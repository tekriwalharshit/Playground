import java.util.Scanner;
class Main{
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int[] z= new int[x];
      int i,i1=-1,i2=-1;
     
        for(i=0;i<x;i++)
        {
          z[i]=s.nextInt();
            }
       int p = s.nextInt();
      int q = s.nextInt();
         for(i=0;i<x;i++)
        {
          if(z[i]==p)
            i1=i;
         
          else if(z[i]==q)
            i2=i;
           
                            
             
            }
      
      System.out.println(i1);
      System.out.println(i2);
    }
}
      
import java.util.Scanner;
class Main{
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int[] z= new int[x];
      int i,max;
             for(i=0;i<x;i++)
        {
          z[i]=s.nextInt();
            }
      max=z[0];
      for(i=1;i<x;i++)
      {
        if(z[i]>max)
          max=z[i];
      }
    
      System.out.println(max);

    }
}
      
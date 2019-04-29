import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
Scanner s= new Scanner(System.in);
      int x= s.nextInt();
       int k=s.nextInt();
      int[] a=new int[x];
      int i,p;
       int[] temp=new int[k+1];
      for(i=0;i<x;i++)
      {
        a[i]=s.nextInt();
           }
     
    
      for(i=0;i<x;i++)
      {
       p=a[i];
        temp[p]++;
        }
           for(i=1;i<=k;i++)
           {
           System.out.println(i+" "+temp[i]);
    }
}
}
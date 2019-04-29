import java.util.Scanner;
class Main{
    public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
    	int n= s.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int i,k=0;
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
      if(a[i]!=0)
        b[k++]=a[i];
    }
      for(i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
    }
import java.util.Scanner;
class Main 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       int a[]=new int[arr_size];
     int x=0;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
           a[index]=index+1;
       }
     for(int index = 0; index < arr_size; index++)
       {
       for(int j=0;j<arr_size;j++)
       {
       if(arr[index]==arr[j])
       {
         x=arr[index];
         a[x-1]=0;
         break;
       }
       }
     }
     for(int j=0;j<arr_size;j++)
       {
       if(a[j]!=0)
      System.out.println(j+1);
     }
     }
}
   
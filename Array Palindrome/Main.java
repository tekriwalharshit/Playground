import java.util.Scanner;
class Main 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
     int c=1,l=arr_size-1,i=0;
            while(c>0)
       {
              if(arr[i++]==arr[l--])
                c++;
              else 
              {
                c=0;
                break;
              }
              if (c==arr_size/2)
              break;
            }
     if(c==l)
       System.out.println("Yes");
     else
       System.out.println("No");
            }
          
          }
   
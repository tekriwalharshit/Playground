import java.util.*;

class Item
{
  private int price;
 void getprice(int p)
 {
   price =p;
}
   int givep()
  { 
     return price;
}
}  
class Customer extends Item
{
  private String product;
  private int quantity;
 void getdetails(String s,int a)
 {
   product=s;
   quantity=a;
}
  int giveq()
  { 
  return quantity;
}
}
class Bill extends Customer
{
 void bill()
 {
   int total=givep()*giveq();
   System.out.println("Total Price is : "+ total);
}
}
class Main
{
  public static void main(String[] args)
  {
   
    Bill obj = new Bill();
    Scanner s= new Scanner(System.in);
    String str= s.nextLine();
    int x=s.nextInt();
    int y=s.nextInt();
    obj.getdetails(str,y);
    obj.getprice(x);
    obj.bill();
  }
}
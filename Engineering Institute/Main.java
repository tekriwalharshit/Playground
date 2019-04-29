import java.util.*;
class Faculty
{
  public int salary;
   public void salary(int a)
  {salary=a;
    System.out.println("Base Salary: "+salary);
  }
}
class CSE extends Faculty
{
  public void salary(int a)
  {
  salary=a+3000;
   System.out.println("CSE Faculty: "+salary);
  }
}
class IT extends Faculty
{
  public void salary(int a)
  {
  salary=a+5000;
   System.out.println("IT Faculty: "+salary);
  }
}
class ECE extends Faculty
{
  public void salary(int a)
  {
  salary=a+4500;
   System.out.println("ECE Faculty: "+salary);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner (System.in);
    int x= s.nextInt();
    Faculty f= new Faculty();
    f.salary(x);
    CSE c= new CSE();
    c.salary(x);
     IT i= new IT();
    i.salary(x);
     ECE obj = new ECE();
    obj.salary(x);
  }
}
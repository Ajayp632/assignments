///////Second Question/////////

class Employee
{
     String name;
     int salary;
     Employee()
     {
          name = null;
          salary = 0;
     }
     Employee (String name, int salary)
     {
          this.name = name;
          this.salary = salary;
     }
     int getSalary()
     {
          return salary;
     }
}
class Manager extends Employee
{
     int hra, ta, sa;
     Manager()
     {
          super();
          hra = ta = 0;
     }
     Manager(String n, int sal, int h, int t, int x)
     {
          super(n, sal);
          hra = h;
          ta = t;
          sa=x;
     }
     int getSalary()
     {
          return (super.getSalary()+hra+ta+sa);
     }
}
class Labour extends Employee
{
     int hra, ta, sal;
     Labour()
     {
          super();
          hra = ta = 0;
     }
     Labour(String n, int sal, int h, int t, int x)
     {
          super(n, sal);
          hra = h;
          ta = t;
          sal=x;
          
     }
     int gettSalary()
     {
          return (super.getSalary()+hra+ta+sal);
     }
}
public class second
{
    public static void main(String[] args)
    {
          
         Labour l2 = new Labour("",20000,500,1500,5000);
         
         System.out.println("Total sallary of Employee is= " +l2.gettSalary());
         
         
    }
}
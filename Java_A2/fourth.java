///////Fourth question////////

abstract class AbstractClass 
{
	public void display() 
   {
      System.out.print("From Abstract Class");
   }
}
public class fourth extends AbstractClass {
   public static void main(String args[]) {
      AbstractClass obj = new fourth();
      obj.display();
   }
}
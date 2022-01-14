/////////Fifth Question/////////

abstract class Shape{  
abstract void draw();  
}  
  
class Line extends Shape{  
void draw(){System.out.println("drawing Line");}  
}
class Square extends Shape{  
void draw(){System.out.println("drawing square");}  
}
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
  
class fifth{  
public static void main(String args[]){  
Shape s1=new Circle();  
Shape s2=new Rectangle();
Shape s3=new Line();
Shape s4=new Square();
s1.draw();
s2.draw();
s3.draw();
s4.draw();
}  
} 
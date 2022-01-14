///////////Seventh Question/////////

import java.util.Arrays;
import java.util.Scanner;
abstract class Dessertitem{
	abstract void getCost();
}
class Candy extends Dessertitem{

	@Override
	void getCost() {
		// TODO Auto-generated method stub
		double val=0;
		int orderqty, amt[]= {5,10,50};
		double tax=0.3;
		System.out.println("Tax on Candy dessert : "+tax);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity to place order :");
		orderqty=sc.nextInt();
    	val = amt[0]*orderqty*60*tax;
		System.out.println("Thank you for placing order!! It costs :"+val+" rupees");
	}
}

class Cookie extends Dessertitem{

	@Override
	void getCost() {
		// TODO Auto-generated method stub
		double val=0;
		int orderqty, amt[]= {5,10,50};
		double tax=0.2;
		System.out.println("Tax on Cookie dessert : "+tax);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity to place order :");
		orderqty=sc.nextInt();
    	val = amt[1]*orderqty*70*tax;
		System.out.println("Thank you for placing order!! It costs :"+val+" rupees");
	}
}

class Icecream extends Dessertitem{

	@Override
	void getCost() {
		// TODO Auto-generated method stub
		double val=0;
		int orderqty, amt[]= {5,10,50};
		double tax=0.5;
		System.out.println("Tax on Icecream dessert : "+tax);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity to place order :");
		orderqty=sc.nextInt();
    	val = amt[2]*orderqty*tax;
		System.out.println("Thank you for placing order!! It costs :"+val+" rupees");
	}
}

public class seventh extends Dessertitem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		String desserts[]= {"Candy","Cookie","Icecream"};
		int qty[]= {10,20,15},amt[]= {5,10,50};
		Dessertitem obj=new seventh(); 
		Dessertitem can=new Candy();
		Dessertitem ck=new Cookie();
		Dessertitem ice=new Icecream();
		Scanner sc = new Scanner(System.in); 
		 char ch;
		 int own;  
	        do {  
	            System.out.println("\n ***Dessert Shop Application welcomes you***");  
	            System.out.println(" a. Owner\n b. Customer\n c. Exit ");  
	            System.out.print("Press a/b/c: ");  
	            ch = sc.next().charAt(0);  
	                switch (ch) {  
	                    case 'a':  
	                    	System.out.println("\n ***Owner***");
	                    	System.out.println("\n ***Dessert you want to add***");  
	         	            System.out.println("1. Candy\n2. Cookie\n3. Icecream ");
	         	            System.out.print("Press 1/2/3: ");
	         	            own=sc.nextInt();
	         	            if(own==1 || own==2 || own ==3) {
	         	            	System.out.println(desserts[own-1]+" Available quantity in stock : "+qty[own-1]);
	         	            	System.out.println("Enter the quantity to add:");
		                    	qty[own-1]=qty[own-1]+sc.nextInt();
		                    	System.out.println("Dessert added succesfully");
		                    	System.out.println("Candy : "+qty[0]+"\nCookie : "+qty[1]+"\nIcecream : "+qty[2]);
		                    	System.out.println("See you soon...Have a great day!!");
	         	            }
	         	            break;
	                    case 'b':  
	                    	System.out.println("\n ***Customer Module***");
	                    	System.out.println("\n ***Dessert you want to place an Order for***");  
	         	            System.out.println("1. Candy\n2. Cookie\n3.Icecream ");
	         	            System.out.println("Enter your choice: ");
	         	            own=sc.nextInt();
	         	           switch(own) {
	         	            case 1:
	         	            	System.out.println("**Candy**");
		                    	System.out.println("quantity Available: "+qty[own-1]);
		                    	System.out.println("Each Candy costs : "+amt[own-1]+" in dollars");
		                    	can.getCost();
		                    	System.out.println("See you soon...Have a great day!!");
		                    	break;
		                    	
	         	           case 2:
	         	            	System.out.println("**Cookie**");
		                    	System.out.println("quantity Available: "+qty[own-1]);
		                    	System.out.println("Each Cookie costs : "+amt[own-1]+" in Euros");
		                    	ck.getCost();
		                    	System.out.println("See you soon...Have a great day!!");
		                    	break;
		                    	
	         	          case 3:
	         	        	  	System.out.println("**Icecream**");
		                    	System.out.println("quantity Available: "+qty[own-1]);
		                    	System.out.println("Each Icecream costs : "+amt[own-1]+" in Rupees");
		                    	ice.getCost();
		                    	System.out.println("See you soon...Have a great day!!");
		                    	break;
		                    	
	         	            }
	                    case 'c':  
	                        //System.out.println("See you soon...Have a great day!!");  
	                        break;
	                }  
	        }  
	        while (ch != 3);  
	        
	}

	@Override
	void getCost() {
		// TODO Auto-generated method stub
		System.out.println("From Main class");
	}

}
///////Third question///////////

import java.util.Scanner;

class Savings{
	public void show(int fd) {
		System.out.println("Fixed Deposit "+fd);
	}
}
class Current{
	public void show(int cc) {
		System.out.println("Cash Credit "+cc);
	}
}
class Totalcash{
	public void show(int ssal,int csal) {
		int sum;
		sum=ssal+csal;
		System.out.println("Total Cash : "+sum);
	}
}
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fdep,ccd;
		Savings s = new Savings();
		Current c = new Current();
		Totalcash tc= new Totalcash();
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Note: fd=fixed deposit");
	     System.out.print("Enter FD for savings account: ");
	     fdep = scanner.nextInt();
	    
	     System.out.print("Enter Cash credit for Current account: ");
	     ccd = scanner.nextInt();
	     s.show(fdep);
	     c.show(ccd);
	     tc.show(fdep,ccd);

	}

}
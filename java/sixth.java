import java.util.Scanner;
    public class sixth {    
	    public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		String unm="ajay";
    		String pwd="ajay@632";
    		String usernm,passwd;
    		int cnt;
    		Scanner sc = new Scanner(System.in);
    		for(cnt=1;cnt<=3;cnt++) {
    		System.out.print("Enter username :");
    		usernm=sc.nextLine();
    		System.out.print("Enter password :");
    		passwd=sc.nextLine();
    		
    		if(usernm.equals(unm) && passwd.equals(pwd)) {
    			System.out.println("Welcome "+usernm);
    		}else if(cnt==3) {
    			System.out.println("Sorry "+usernm+"!! Contact Admin");
    		}
    		else {
    			System.out.println("Invalid credentials.Try Again!!Remaining Attempts "+(3-cnt));
    		}
    		}
    		
    	}
    }
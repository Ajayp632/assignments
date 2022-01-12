import java.util.Scanner;
        public class fourth {
	    public static void main(String[] args) {
        		// TODO Auto-generated method stub
        		int maths,java,english,result;
        		Scanner sc = new Scanner(System. in);
        		System.out.println("Enter Maths marks:");
        		maths=sc.nextInt();
        		System.out.println("Enter java marks:");
        		java=sc.nextInt();
        		System.out.println("Enter english marks:");
        		english=sc.nextInt();
        		
        		if(maths>=60 && java>=60 && english>=60) {
        			System.out.println("Result : Passed:)");
        		}else if(maths>=60 && java>=60 || java>=60 && english>=60 || maths>=60 && english>=60) {
        			System.out.println("Result : Promoted!!");
        		}else {
        			System.out.println("Result : Failed:(");
        		}	
        	}
        }
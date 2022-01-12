import java.util.Scanner;
    public class fifth
    {
	    public static void main(String args[])
	    {
        	double tax=0,inc;
        	Scanner sc=new Scanner(System.in);
        	System.out.print("Enter income: ");
        	inc=sc.nextDouble();
        	if(inc<=180000) {
        		tax=0;
        	}else if(inc<=300000) {
        		tax=(inc/100)*10;
        	}else if(inc<=500000) {
        		tax=(inc/100)*20;
        	}else if(inc<=1000000) {
        		tax=(inc/100)*30;
        	}
        	System.out.println("Your income tax amount is "+tax);
        	}
    }
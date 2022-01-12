import java.util.Scanner;

public class ninth {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double a[][] = new double[3][3];
		double sum = 0; 
		
		System.out.println("Enter the marks ");
		for (int i=0;i<3;i++) 
		{
			System.out.println("Enter the marks for student "+(i+1));
			for (int j=0;j<3;j++) 
			{
				a[i][j]=scanner.nextInt() ;
			}
		}
		for (int i=0;i<3;i++) 
		{
			for (int j=0;j<3;j++) 
			{
					sum += a[i][j];
			}
		}
		System. out. println("Total marks in all subjects is: "+ sum);
		System. out. println("Average marks in all subjects is: "+ sum/9) ;
		
		sum = 0;
		for (int i=0;i<3;i++) 
		{
			sum=0;
			for (int j=0;j<3;j++) 
			{
					sum += a[i][j];
			}
		
			
			System.out.println();
			System. out. println("Total marks for student "+ (i+1) +" of each subject is: "+ sum) ;
			System. out. println("Average marks for student "+ (i+1) +" of each subject is: "+ sum/3);
			System.out.println();
			
			sum = 0;
		}
	}
}
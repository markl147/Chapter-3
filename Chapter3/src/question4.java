import java.util.Scanner;
public class question4 
{

	public static void main(String[] args) 
	{
		int year = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a year (YYYY): ");
		year = in.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.printf(year + " is a leap year");
		}
		
		else
		{
			System.out.println(year + " is NOT a leap year");
		}
		
	}

}

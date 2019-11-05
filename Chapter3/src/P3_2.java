import java.util.Scanner;
public class P3_2 
{

	public static void main(String[] args) 
	{
		double number = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		number = in.nextDouble();
		
		if (number == 0)
		{
			System.out.print("The number is zero");
		}
		
		else if (number > 0 && number < 1)
		{
			System.out.print("The number is small");
		}
		
		else if (number > 1 && number <= 1000000)
		{
			System.out.print("The number is positive");
		}
		
		else if (number > 1000000)
		{
			System.out.print("The number is positively large");
		}
		
		else
		{
			System.out.print("The number is negative");
		}
				
		in.close();
	}

}

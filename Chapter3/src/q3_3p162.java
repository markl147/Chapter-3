import java.util.Scanner;
public class q3_3p162 
{

	public static void main(String[] args) 
	{
		int number = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		number = in.nextInt();
		
		if(number <= 0)
		{
			number = number * -1;
		}
		
		if(number >= 1 && number <= 9)
		{
			System.out.print("The number has 1 digit");
		}
		else if(number >= 10 && number <= 99)
		{
			System.out.print("The number has 2 digits");
		}
		else if(number >= 100 && number <= 999)
		{
			System.out.print("The number has 3 digits");
		}
	}

}

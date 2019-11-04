import java.util.Scanner;

public class q3_4 
{

	public static void main(String[] args) 
	{
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		number1 = in.nextInt();
		
		System.out.print("Please enter an integer value: ");
		number2 = in.nextInt();
		
		System.out.print("Please enter an integer value: ");
		number3 = in.nextInt();
		
		if(number1 == number2 && number2 == number3)
		{
			System.out.print("They are all the same!");
		}
		else if(number1 != number2 && number2 != number3 && number1 != number3)
		{
			System.out.print("They are all the different!");
		}
		else
		{
			System.out.println("Neither!");
		}
	}

}

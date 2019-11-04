import java.util.Scanner;
public class P3_3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter in a number: ");
		int number = in.nextInt();
		
		if (number < 0)
		{
			number = number * -1;
		}
		
		if ( number < 10)
		{
			System.out.printf("%d has 1 digit in it!\n", number);
		}
		else if ( number < 100)
		{
			System.out.printf("%d has 2 digits in it!\n", number);
		}
		else if ( number < 1000)
		{
			System.out.printf("%d has 3 digits in it!\n", number);
		}
		else if ( number < 10000)
		{
			System.out.printf("%d has 4 digits in it!\n", number);
		}
		else if ( number < 100000)
		{
			System.out.printf("%d has 5 digits in it!\n", number);
		}
		else if ( number < 1000000)
		{
			System.out.printf("%d has 6 digits in it!\n", number);
		}
		else if ( number < 10000000)
		{
			System.out.printf("%d has 7 digits in it!\n", number);
		}
		else if ( number < 100000000)
		{
			System.out.printf("%d has 8 digits in it!\n", number);
		}
		else if ( number < 1000000000)
		{
			System.out.printf("%d has 9 digits in it!\n", number);
		}
		else
		{
			System.out.printf("%d has 10 digits in it!\n", number);
		}
	}
}
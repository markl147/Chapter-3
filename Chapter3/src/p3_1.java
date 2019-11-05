import java.util.Scanner;
public class p3_1 
{

	public static void main(String[] args) 
	{
		int value = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a whole number: ");
		value = in.nextInt();
		
		if (value == 0)
		{
			System.out.print("The value is zero");
		}
		
		else if (value > 0)
			
		{
			System.out.print("The value is positive");
		}
		
		else
		{
			System.out.print("The value is negative");
		}
		in.close();
	}
}
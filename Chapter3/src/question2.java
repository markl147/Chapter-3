import java.util.Scanner;
public class question2 
{

	public static void main(String[] args) 
	{
		int value = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a whole number: ");
		value = in.nextInt();
		
		if(value >= 1 && value <= 100)
		{
			System.out.print("The number " + value + " is between 1 and 100");
		}
		else
		{
			System.out.print("The number " + value + " is not between 1 and 100");
		}
	}

}

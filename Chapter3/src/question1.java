import java.util.Scanner;
public class question1 
{

	public static void main(String[] args) 
	{
		int value = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a number: ");
		value = in.nextInt();
		
		if (value % 2 == 0)
			{
				System.out.print("The number " + value + " is even");
			}
		else
			{
				System.out.print("The number " + value + " is odd");
			}
		
	}

}

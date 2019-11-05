import java.util.Scanner;

public class p3_6 
{

	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please indicate which mode you'd like to enter, strict or lenient? ");
		String input = in.next();
		
		System.out.print("Please enter an integer value: ");
		num1 = in.nextInt();
		
		System.out.print("Please enter an integer value: ");
		num2 = in.nextInt();
		
		System.out.print("Please enter an integer value: ");
		num3 = in.nextInt();
		
		if(input.equals("strict"))
		{
		
			if(num1 < num2 && num2 < num3)
				{
					System.out.print("Increasing!");
				}
			else if(num1 > num2 && num2 > num3)
				{
					System.out.print("Decreasing!");
				}
			else
				{
					System.out.println("Neither!");
				}
		}
		
		else if(input.equals("lenient"))
		{
			if(num1 < num2 && num2 <= num3)
			{
				System.out.print("Increasing!");
			}
			
			else if (num1 > num2 && num2 >= num3)
			{
				System.out.print("Decreasing!");
			}
			
			else if (num1 == num2 && num2 == num3)
			{
				System.out.print("Both increasing and decreasing!");
			}
		}
		
		in.close();
	}

}
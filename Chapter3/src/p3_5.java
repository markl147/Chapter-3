import java.util.Scanner;

public class p3_5 
{

	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		num1 = in.nextInt();
		
		System.out.print("Please enter an integer value: ");
		num2 = in.nextInt();
		
		System.out.print("Please enter an integer value: ");
		num3 = in.nextInt();
		
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
		
		in.close();
	}

}
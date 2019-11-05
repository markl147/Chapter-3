import java.util.Scanner;
public class p3_7 
{

	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		num1 = in.nextInt();
		
		System.out.print("Please enter a number: ");
		num2 = in.nextInt();
		
		System.out.print("Please enter a number: ");
		num3 = in.nextInt();
		
		if (num1 < num2 && num2 <= num3 || num1 > num2 && num2 >= num3)
		{
			System.out.print("In order!");
		}
		
		else
		{
			System.out.print("Not in order!");
		}
		
	//	else if (num1 < num2 && num2 > num3)
	//	{
	//		System.out.print("Not in order!");
	//	}
		
		in.close();
	}

}

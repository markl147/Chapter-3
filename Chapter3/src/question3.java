import java.util.Scanner;
public class question3
{

	public static void main(String[] args) 
	{
		String character;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a character: ");
		character = in.nextLine();
		
		char value = character.charAt(0);
		
		if(value >= 'a' && value <= 'z')
		{
			System.out.print(value + " is a lower case chacter");
		}
		else
		{
			System.out.print(value + " is a higher case chacter");
		}
	}

}
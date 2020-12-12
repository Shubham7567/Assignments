/*
The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a
lowercase letter to uppercase, subtract 32 from it. Use this information to write a program that
reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and all
uppercase letters to lowercase, displaying the result. Make no changes to any other character.
Have the program stop when the user enters a period. At the end, have the program display the
number of case changes that have taken place.
*/

public class Programm37
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		char ch=' ', ignore;
		int ucnt=0 , lcnt=0 ;

		while(ch!='.')
		{
			System.out.println("Enter Character (press . to quit): ");
			ch = (char) System.in.read();
			
			do{
				ignore = (char) System.in.read();
			}while(ignore!='\n');
			
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
				System.out.println("Now, The charcter is : " + (char)ch);
				lcnt++;
			}
			else if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
				System.out.println("Now, The charcter is : " + (char)ch);
				ucnt++;
			}
			else
			{
				if(ch!='.')
					System.out.println("The charcter is : " + (char)ch);
			}
		}
		
		System.out.println("The uppercase conversions are : "+ucnt);
		System.out.println("The lowercase conversions are : "+lcnt);
	}
}

/*
Write a program to generate a random sequence of capital letters that does not include vowels.
*/
public class Programm30iv
{
	public static void main(String[] args)
	{
		char ch;
		double rand;
		rand = 65 + ( Math.random()*(90-65));
		ch=(char)Math.round(rand);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("The random Capital Number is : "+(char)(ch+3));
		}
		else
		{
			System.out.println("The Random Capital Number is : "+ch);
		}
		
	}
}

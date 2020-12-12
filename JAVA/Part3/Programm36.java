//Guess the letter game
public class Programm36
{
    public static void main(String[] args)
	throws java.io.IOException
	{
		char ch,ignor,answer = 'K';
		
		do
		{
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you Guess it  : ");
			
			ch = (char) System.in.read();
			
			//discards any other charcter in the input
			do{
				ignor = (char) System.in.read();
			}while(ignor!='\n');
			
			if(ch==answer) System.out.println("** Right **");
			else
			{
				System.out.print("...Sorry, you're");
				if(ch < answer) System.out.println(" too low");
				else System.out.println(" too high");
				System.out.println("Try again!\n");
			}
		}while(answer!=ch);
	}
}
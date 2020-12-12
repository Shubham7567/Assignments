/*
A lottery requires that you select six different numbers from the integers 1 to 49. Write a     
 program to do this for you and generate five sets of entries.
*/
public class Programm30iii
{
	public static void main(String[] args)
	{
		for(int i=0; i<5 ; i++)
		{
			System.out.print("\nThe "+(i+1)+ " set is : ");
			for(int j=0 ; j<6 ;)
			{
				System.out.print((int)( 1 + (Math.random() * (49-1) ) ) );
				System.out.print("\t");
				j++;
			}
		}
	}
}

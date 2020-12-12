//Arithmetic with character code
public class Programm16
{
    public static void main(String[] args)
    {
        char letter1 = 'A';
        char letter2 = (char)(letter1 + 1);
        char letter3 = letter2;

        System.out.println("Here\'s a sequance of letters:" + letter1 + letter2 + (++letter3));

        //letter3 is now c
        System.out.println("Here are the decimal codes for the letters:\n"+
                            letter1 + " : " + (int)letter1 + 
                            "   " + letter2 + " : " + (int)letter2 +
                            "   " + letter3 + " : " + (int)letter3);
    }
}
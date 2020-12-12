//demonstrate do while loop oracle press
public class Programm35
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        char ch;

        do{
            System.out.println("Press a key followed by Enter: ");
            ch = (char)System.in.read();
        }while(ch != 'q');

    }
}
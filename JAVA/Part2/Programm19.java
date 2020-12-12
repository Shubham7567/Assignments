//Methods of operations on bits
import static java.lang.Long.*;

public class Programm19
{
    public static void main(String[] args)
    {
        long number = 0xF00000000000000FL;
        System.out.println("number:\n" + toBinaryString(number));

        long result = rotateLeft(number, 2);
        System.out.println("number rotated left 2 bits:\n" + toBinaryString(result));

        result = rotateRight(number, 2);
        System.out.println("number rotated right 2 bits:\n" + toBinaryString(result));

        result = reverse(result);
        System.out.println("previous result reversed:\n" + toBinaryString(result));

        System.out.println("Bit count in number:\n" + bitCount(number));
    }
}
//Switch case
public class Programm22
{
    enum Washchoice {cotton, wool, linen, synthetic}
    public static void main(String[] args)
    {
        Washchoice wash = Washchoice.cotton;

        int clothes = 3;

        switch(clothes){
            case 1:
                System.out.println("Washing shirts.");
                wash = Washchoice.cotton;
                break;
            case 2:
                System.out.println("Washing sweaters.");
                wash = Washchoice.wool;
                break;
            case 3:
                System.out.println("Washing socks.");
                wash = Washchoice.wool;
                break;
            case 4:
                System.out.println("Washing sheets.");
                wash = Washchoice.linen;
                break;
            case 5:
                System.out.println("Washing pants.");
                wash = Washchoice.synthetic;
                break;
            default:
                System.out.println("Unknown washing - default synthetic");
                wash = Washchoice.synthetic;
                break;
        }

        System.out.println("wash is " + wash);

        switch(wash){
            case wool:
                System.out.println("Temprature is 120.");
                break;
            case cotton:
                System.out.println("Temprature is 170.");
                break;
            case synthetic:
                System.out.println("Temprature is 130.");
                break;
            case linen:
                System.out.println("Temprature is 180.");
                break;
        }
    }
}
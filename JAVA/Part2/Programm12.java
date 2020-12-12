class Programm12
{
    public static void main(String[] args)
    {
        int number=0,range=0;
        number = Integer.parseInt(args[0]);

        for(int index=1;index<=10;index++)
        {
            System.out.println(number + " * " + index + " = " + (number*index));
        }
    }
}
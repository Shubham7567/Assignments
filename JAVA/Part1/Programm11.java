class Programm11
{
    public static void main(String[] args)
    {
        int x; //known to all code within the main

        x=10;
        if(x==10)
        {//start of new scope

            int y = 20;//limited to if scope only

            //x and y both are known here

            System.out.println("x and y: " + x + " " + y);

            x = y * 2;
        }
        //y = 10; //Error: y is not known here

        //x is still known here
        System.out.println("x is now " + x);
    }
}
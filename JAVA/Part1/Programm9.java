class Programm9
{
    public static void main(String[] args)
    {
        boolean b;
        
        b = false;//assigning false to b
        System.out.println("b is "+b);

        b = true;//assigning false to b
        System.out.println("b is "+b);

        if(b) System.out.println("This is executed");//using b in if

        b = false;
        if(b) System.out.println("This is executed");//using b in if with the value false

        //outcome of a relational operator is boolean value
        System.out.println("10 > 9 is " + (10>9));
    }
}
class Programm3
{
    public static void main(String[] args)
    {
        float no1,no2;
        no1 = Float.parseFloat(args[0]);
        no2 = Float.parseFloat(args[1]);
        
        System.out.println(no1 + " + " + no2 + " = " + (no1+no2));//for addition
        System.out.println(no1 + " * " + no2 + " = " + (no1*no2));//for multiplication
        System.out.println(no1 + " / " + no2 + " = " + (no1/no2));//for division
        System.out.println(no1 + " - " + no2 + " = " + (no1-no2));//for substraction
    }
}
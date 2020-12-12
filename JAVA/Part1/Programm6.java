import java.util.*;
class Programm6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        
        float num1=0,num2=0;
        System.out.println("Enter a number");
        num1 = sc.nextFloat();
        System.out.println("Enter a number");
        num2 = sc.nextFloat();
        String option = new String();
        System.out.println("We have addition substraction multiplication division");
        System.out.println("What do you want please enter : ");
        option = sc.nextLine();
        option = sc.nextLine();
        if(option.equals("Addition") || option.equals("addition") || option.equals("add"))
        {
            System.out.println("Addition IS \n" + (num1+num2));
        }
        else if(option.equals("Substraction") || option.equals("substraction") || option.equals("sub"))
        {
            System.out.println("Substraction IS \n" + (num1-num2));
        }
        else if(option.equals("Multiplication") || option.equals("multiplication") || option.equals("mul"))
        {
            System.out.println("Multiplication IS \n" + (num1*num2));
        }
        else if(option.equals("Division") || option.equals("division") || option.equals("div"))
        {
            System.out.println("Division IS \n" + (num1/num2));
        }
        else
        {
            System.out.println(option);
            System.out.println("Wrong choice");
        }
    }
}
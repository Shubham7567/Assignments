import java.util.*;
class Programm7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5],i=0;
        for(i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }

        int max=0,sum=0;

        for(i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
            sum += a[i];
        }

        System.out.println("max : " + max);

        System.out.println("sum : " + sum);

        System.out.print("\n List : ");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
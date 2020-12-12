//Write a program to display a random choice from a set of six choices for breakfast (you could
//use any set; for example, scrambled eggs, waffles, fruit, cereal, toast, or yogurt).
public class Programm30i
{
    enum BreackFast {eggs,waffles,fruit,cereal,toast,yogurt}

    public static void main(String[] args)
    {
        int num = 0;
        double rand = 0;

        BreackFast breakfast = BreackFast.eggs;

        rand = 6*Math.random();
        num = (int)Math.round(rand);

        System.out.println("\nThe Breakfast menu is:");
        System.out.println("1."+BreackFast.eggs);
        System.out.println("2."+BreackFast.waffles);
        System.out.println("3."+BreackFast.fruit);
        System.out.println("4."+BreackFast.cereal);
        System.out.println("5."+BreackFast.toast);
        System.out.println("6."+BreackFast.yogurt);

        switch (num) {
            case 1:
                breakfast = BreackFast.eggs;
                break;
            case 2:
                breakfast = BreackFast.waffles;
                break;
            case 3:
                breakfast = BreackFast.fruit;
                break;
            case 4:
                breakfast = BreackFast.cereal;
                break;
            case 5:
                breakfast = BreackFast.toast;
                break;
            case 6:
                breakfast = BreackFast.yogurt;
                break;
        
            default:
                break;
        }

        System.out.println("Today's breakfast is " + breakfast);

    }
}

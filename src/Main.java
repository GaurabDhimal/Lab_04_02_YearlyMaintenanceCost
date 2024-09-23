public class Main
{
    public static void main(String[] args)
    {
        double springCost = 58.77;
        double summerCost = 63.38;
        double autumnCost = 52.19;
        double winterCost = 70.02;
        double yearlyCost = 0;

        yearlyCost = springCost + summerCost + autumnCost + winterCost;

        System.out.println("Your yearly maintenance cost combines your Spring cost ($" + springCost + "), your Summer cost ($" + summerCost + "), your Autumn cost ($" + autumnCost + ") and your winter cost ($" + winterCost + ") for a total of $" + yearlyCost);

    }
}
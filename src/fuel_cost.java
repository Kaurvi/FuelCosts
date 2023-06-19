import java.util.Scanner;

public class fuel_cost {
    private static boolean numberGallonGasDone;
    private static boolean fuelEfficiencyDone;
    private static boolean fuelPriceDone;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double numberGallonGas = 0.0;
        double fuelEfficiency = 0.0;
        double fuelPrice = 0.0;

        String numberGallonGasTrash = "";
        String fuelEfficiencyTrash = "";
        String fuelPriceTrash = "";

        numberGallonGasDone = false;
        fuelEfficiencyDone = false;
        fuelPriceDone = false;
        do
        {
            System.out.print("Enter number of gallons of gas in tank: ");
            if (in.hasNextDouble())
            {
                numberGallonGas = in.nextDouble();
                numberGallonGasDone = true;

            } else {
                numberGallonGasTrash = in.next();
                System.out.println("The value you enetered is not valid: " + numberGallonGasTrash + "\n");
            }
        }
        while (!numberGallonGasDone);
        do
        {
            System.out.print("Enter miles per gallon: ");
            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                fuelEfficiencyDone = true;
            }
            else
            {
                fuelEfficiencyTrash = in.next();
                System.out.println("The value you entered is not valid: " + fuelEfficiencyTrash + "\n");
            }
        }
        while (!fuelEfficiencyDone);
        do
        {
            System.out.print("Enter the price of fuel per gallon: ");
            if (in.hasNextDouble())
            {
                fuelPrice = in.nextDouble();
                fuelPriceDone= true;
            } else {
                fuelPriceTrash = in.next();
                System.out.println("The value you entered is not valid: " + fuelPriceTrash + "\n");
            }
        }
        while (!fuelPriceDone);

        double  cost = 0.0;
        cost = ((100/fuelEfficiency)*fuelPrice);
        System.out.println("The cost per 100 miles would be: $" + cost);

        double distance;
        distance = fuelEfficiency*numberGallonGas;
        System.out.println("The maximum distance would be: " + distance);
    }
}


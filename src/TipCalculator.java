import java.util.Objects;
import java.util.Scanner;
import java.util. ArrayList;
public class TipCalculator {
    public static void main(String[] args) {
        double num;
        Scanner scan = new Scanner(System.in);

        //inserting user's input into an array to add them
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> dishItems = new ArrayList<String>();
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group? ");
        int people = scan.nextInt();
        System.out.println("What's the tip percentage? (0-100) ");
        int tip = scan.nextInt();
        double cost = 0;
        String nameOfItem = "0";


        //while loop to repeat cost line
        while (cost != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (enter -1 for the last item and to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            prices.add(cost);

            System.out.println("Enter the item: ");
            nameOfItem = scan.nextLine();
            dishItems.add(nameOfItem);
            if (cost == -1) {
                break;
            }
        }



        //index starts at 0 like python so removing 1 will make it start from 1
        int index = prices.size() - 1;
        prices. remove(index);

        double priceSum = 0;
        for (int i = 0; i < prices.size(); i++){
            priceSum = priceSum + prices.get(i);
        }

        //freestyle: everyone gets a 10% discount on Mondays
        System.out.println("Is today a Monday? ");
        String day = scan.nextLine();

        //freestyle 2nd part
        if (Objects.equals (day, "yes") ){
            System.out.println("Awesome! All customers get a 10% discount on their total before the tax and tip! You'll see it applied on the bill.");
            priceSum = priceSum * 0.90;
        } else{
            System.out.println("Aww, for future reference, we give a discount on Mondays. Maybe next time!");
        }

        //all required outputs in variables to make it easier
        double tipVal = (double) tip / 100;
        double tipTotal =  (tipVal * priceSum);
        double billTotal =  (priceSum + tipTotal);
        double costPerPerson =  (priceSum / people);
        double tipPerPerson = (tipTotal / people);
        double totalPerPerson =  (billTotal / people);

        //Print statements(bill)
        //Math.round used to make all outputs round to 2 decimal places
        //information taken from https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
        //chose math.round because I didn't want to use another class that would complicate things

        System.out.println("------------------------");
        System.out.println("Total bill before tip: $" + Math.round (priceSum * 100.0) / 100.0);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + Math.round (tipTotal * 100.0) / 100.0);
        System.out.println("Total bill with tip: $" + Math.round(billTotal * 100.0) /100.0);
        System.out.println("Per person cost before tip: $" + Math.round(costPerPerson * 100.0) /100.0);
        System.out.println("Tip per person: $" + Math.round(tipPerPerson * 100.0) / 100.0);
        System.out.println("Total cost per person: $" + Math.round(totalPerPerson * 100.0) / 100.0);
        System.out.println("--------------------------");
        System.out.println("Items ordered: ");
        System.out.println(dishItems);





    }
}
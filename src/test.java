/*import java.util.ArrayList;
import java.util.Scanner;
public class test {
    public static double main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //double num ;

        System.out.println("Welcome to the tip calculator program!");
        System.out.print("How many people will be seated today? ");
        int people = scan.nextInt();
        ArrayList<Double> prices = new ArrayList<Double>();

        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 )-1 to end): ");
        double num = scan.nextDouble();
        double tipTotal = ((tip / 100) * num);
        double finalBill = num + tipTotal;

        while (num != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 )-1 to end):");
            num = scan.nextDouble();
            prices.add(num);
        }
        return num;

        //int index = prices.size()-1;
        //prices.remove(index);





        System.out.println("----------------------------------------");
        System.out.println("Total bill before tip: " + num);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: " + tipTotal);
        System.out.println("Total bill with tip: " + finalBill);
        System.out.println("Per person cost before tip: " + (num / people));
        System.out.println("Tip per person: " + (tip / people));
        System.out.println("Total cost per person: " + ((tip / people) + (num / people)));


    }




        /*int index = prices.size()-1;
        prices.remove(index);

        double tipTotal = (double) (tip/100) * num;

        System.out.println ("----------------------------------------");
        System.out.println("Total bill before tip: " + num);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: " + tipTotal);
        System.out.println("Total bill with tip: " + ((100-tip) / 100) * num);
        System.out.println("Per person cost before tip: " + (num/people));
        System.out.println("Tip per person: " + (tip/people));
        System.out.println("Total cost per person: " + (tip/people) + (num/people) );*/


import java.lang.module.FindException;
import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the tip calculator program!");
        System.out.print("How many people will be seated today? ");
        int people = scan.nextInt();
        ArrayList <Double> prices= new ArrayList<Double>();

        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 )-1 to end): ");
        double num = scan.nextDouble();


        while (num != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 )-1 to end):");
            num = scan.nextDouble();
            prices.add(num);
            }

        int index = prices.size()-1;
        prices.remove(index);



        }

        /*System.out.println("----------------------------------------");
        System.out.println("Total bill before tip: ");
        System.out.println("Total percentage: ");
        System.out.println("Total tip: ");
        System.out.println("Total bill with tip: ");
        System.out.println("Per person cost before tip: ");
        System.out.println("Tip per person: ");
        System.out.println("Total cost per person: ");*/

    }


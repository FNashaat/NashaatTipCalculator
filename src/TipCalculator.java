import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the tip calculator program!");
        System.out.print("How many people will be seated today? ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 )-1 to end): ");
        double num = scan.nextDouble();

        while (num != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 )-1 to end):");
            num = scan.nextDouble();
            int
        }
        System.out.print("----------------------------------------");
        System.out.println("Total bill before tip: ");
        System.out.println("Total perentage: ");
        System.out.println("Total tip: ");






    }
}

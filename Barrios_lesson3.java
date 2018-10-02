
import java.util.Scanner;

public class Barrios_lesson3 {
    public static void main(String[] args) {
        // variables I will be using for calculations
        final double tax = 0.0675;
        final double tip = 0.15;
        double cost, total, taxMath, tipMath, tempTotal;
        System.out.println("What is the cost of the meal?");
        // cost is received from the user
        Scanner answer = new Scanner(System.in);
        cost = answer.nextDouble();
        // calculate tax, temporary total, and tip
        taxMath = cost * tax;
        tempTotal = cost + taxMath;
        tipMath = tempTotal * tip;
        // total cost is added
        total = tempTotal + tipMath;
        // end of calculations
        System.out.println("             ");
        System.out.println("        Seminole Buffet     ");
        System.out.println("        123 Gaines Street     ");
        System.out.println("        Tallahassee, Florida 32301     ");
        System.out.println("             ");
        System.out.println("Receipt Details:");
        System.out.println("Meal Cost:  " + cost);
        System.out.println("Tax Amount:  " + taxMath);
        System.out.println("Tip Amount:  " + tipMath);
        System.out.println("Total Bill:  " + total);
        System.out.println("             ");
        System.out.println("Thank you for dining with us!");
        System.out.println("Please Come Again to Seminole Buffet!");
    }
}
import java.text.DecimalFormat;
import java.util.Scanner;
public class TipCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many are in your group: ");
        int groupamount = scan.nextInt();
        System.out.print("What is the percentage of the tip: ");
        int percentage = scan.nextInt();
        System.out.print("Enter the cost in dollars and cents. Press -1 when done: ");
        double cost = scan.nextDouble();
        while (cost != -1){
            System.out.print("Enter the cost in dollars and cents. Press -1 when done: ");
            cost = scan.nextDouble();
         double totalcost = cost;
         System.out.println("the total is: " + totalcost);
        }
    }
}

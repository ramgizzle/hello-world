import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Parcel> list = new ArrayList<>();

        String choice = "";

        do {
            // --- Get Parcel Info ---
            System.out.print("Enter Parcel ID: ");
            int id = input.nextInt();

            System.out.print("Enter acres: ");
            double acres = input.nextDouble();

            input.nextLine(); // clear line

            System.out.print("Enter zoning (residential/commercial): ");
            String zoning = input.nextLine();

            // --- Get Building Info ---
            System.out.print("Enter building address: ");
            String address = input.nextLine();

            System.out.print("Enter building size: ");
            double size = input.nextDouble();

            // --- Prevent negative numbers ---
            if (acres < 0 || size < 0) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            // --- Create objects ---
            Building b = new Building(address, size);
            Parcel p = new Parcel(id, acres, zoning, b);

            list.add(p);

            input.nextLine(); // clear line
            System.out.print("Add another? (yes/no): ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // --- Output all parcels ---
        double totalTax = 0;

        for (Parcel p : list) {
            System.out.println("\n-------------------");
            System.out.println(p);
            totalTax += p.calculateTax();
        }

        // --- Average ---
        if (list.size() > 0) {
            double avg = totalTax / list.size();
            System.out.println("\nAverage Tax: $" + avg);
        }
    }
}
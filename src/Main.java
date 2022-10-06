import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        String trash = "";

        System.out.print("Enter number of gallons in tank: ");
        if(in.hasNextDouble()) {
            gallons = in.nextDouble();
            in.nextLine();

            System.out.println("You said the number of gallons were: " + gallons);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter fuel efficiency in miles per gallon: ");
        if(in.hasNextDouble()) {
            efficiency = in.nextDouble();
            in.nextLine();

            System.out.println("You said the fuel efficiency was: " + efficiency + " miles per gallon");
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter price of gas per gallon: ");
        if(in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();

            System.out.println("You said the gas price was: $" + price);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid price");
        }

        double cost = (100/efficiency) * price;
        double far = efficiency * gallons;
        double roundCost = Math.round(cost * 100)/100D;

        System.out.println("Cost per 100 miles: $" + roundCost);
        System.out.println("The car can go " + far + " miles with the gas in your tank");
    }
}
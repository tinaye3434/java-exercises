import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        My Version


        double temp;
        double newTemp;
        int choice;

        //prompt user

        System.out.println("Welcome to the temperature converter app");
        System.out.println("Enter 1 to convert to degrees\n" + "Enter 2 to convert to Fahrenheit");
        choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        temp = scanner.nextDouble();

        newTemp = (choice == 1) ? (temp - 32) * (5.0/9.0) : temp * (9.0/5.0) + 32;

        System.out.println("Converted value is: " + newTemp);

         */

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 /9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f°%s",newTemp, unit);
        scanner.close();
    }
}

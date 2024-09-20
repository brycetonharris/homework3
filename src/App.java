import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float Kilogram;
        float Pound;
        float Gram;
        float Ounce;
        float Mile;
        float Kilometer;
        float Milimeter;
        float Inch;
        float conversion;
        String continueChoice = "yes";

        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("What conversion would you like to make? (type 1-4)");
            System.out.println("1. Kg to Lb");
            System.out.println("2. Gram to Ounces");
            System.out.println("3. Mile to Kilometer");
            System.out.println("4. Milimeter to Inch");

            System.out.print("Your choice: ");
            conversion = scanner.nextFloat();


        
            
            if (conversion == 1) {
                System.out.print("Kilograms: ");
                Kilogram = scanner.nextFloat();
                Pound = Kilogram * 2.2046f;
                System.out.print("Pounds: ");
                System.out.println(Pound);

            } else if (conversion == 2) {
                System.out.print("Grams: ");
                Gram = scanner.nextFloat();
                Ounce = Gram * 0.035274f;
                System.out.print("Ounces: ");
                System.out.println(Ounce);
                
            } else if (conversion == 3) {
                System.out.print("Miles: ");
                Mile = scanner.nextFloat();
                Kilometer = Mile * 1.60934f;
                System.out.print("Kilometers: ");
                System.out.println(Kilometer);

            } else if (conversion == 4) {
                System.out.print("Milimeters: ");
                Milimeter = scanner.nextFloat();
                Inch = Milimeter * 0.0393701f;
                System.out.print("Inches: ");
                System.out.println(Inch);

            } else 
                System.out.println("Invalid format.");

            System.out.print("Do you want to continue? (Yes/No): ");
            continueChoice = scanner.next();



        } while (continueChoice.toLowerCase().equals("yes"));
        scanner.close();
    }
}

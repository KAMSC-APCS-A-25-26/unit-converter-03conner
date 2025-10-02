import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double distance;
        int choice;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. exit");
            System.out.println("Enter a choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    distance = sc.nextDouble();
                    System.out.println("Conversion Results");
                    System.out.println("Fahrenheit: " + distance);
                    distance = (distance - 32) * 5/9;
                    System.out.println("Celsius: " + distance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter temperature in Celsius");
                    distance = sc.nextDouble();
                    System.out.println("Conversion Results");
                    System.out.println("Celsius: " + distance);
                    distance = distance * (9/5) + 32;
                    System.out.println("Fahrenheit: " + distance);
                    System.out.println();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }


        }
        System.out.println("Goodbye");

    }
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
    }

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        double distance;
        int choice;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("Choose Conversion Direction:");
            System.out.println("1. Convert Miles to Kilometers:");
            System.out.println("2. Convert Kilometers to Miles:");
            System.out.println("3. Exit:");
            System.out.println("Enter a choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter distance in Miles:");
                    distance = sc.nextDouble();
                    System.out.println("Conversion Results:");
                    System.out.println("Miles: " + distance);
                    distance = distance * 1.60935;
                    System.out.println("Kilometers: " + distance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter distance in Kilometers:");
                    distance = sc.nextDouble();
                    System.out.println("Conversion Results:");
                    System.out.println("Kilometers: " + distance);
                    distance = distance / 1.60935;
                    System.out.println("Miles: " + distance);
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
        System.out.println("Goodbye!");

        }
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
    }

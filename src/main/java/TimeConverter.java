import java.util.Objects;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        int hour, minute, second, num1, num2, num3;
        double choice;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("Convert Time to Total Seconds:");
            System.out.println("Enter Hour:");
            hour = sc.nextInt();
            System.out.println("Enter Minute:");
            minute = sc.nextInt();
            System.out.println("Enter Second:");
            second = sc.nextInt();
            System.out.println();



            System.out.println("Time Conversion:");
            System.out.println("Input: "+ hour +" Hours, " +minute + " Minute, " + second + " Second");
            num1 = minute * 60;
            num3 = hour * 60 * 60;
            num2 = num3 + num1 + second;
            System.out.println(hour + " Hour * 3600 = " + num3);
            System.out.println(minute + " Minute * 36 = " + num1);
            System.out.println(second +" Second * 1 = " + second);
            System.out.println("Total = " + num2 + " seconds");


            System.out.println("Do you want to convert another time? (y/n)");
            sc.nextLine();
            String choice2 = sc.nextLine();
            if(Objects.equals(choice2, "n")){
                run = false;
            }

            }
        System.out.println("Goodbye!");
            }



        }

        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit

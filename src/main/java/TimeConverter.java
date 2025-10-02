import java.util.Objects;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        int hour, minute, second, num1, num2, num3;
        double choice;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("Convert time to total seconds");
            System.out.println("Enter Hours");
            hour = sc.nextInt();
            System.out.println("Enter Minutes");
            minute = sc.nextInt();
            System.out.println("Enter Seconds");
            second = sc.nextInt();
            System.out.println();



            System.out.println("Time conversion");
            System.out.println("input: "+ hour +" hours, " +minute + " minute, " + second + " second");
            num1 = minute * 60;
            num3 = hour * 60 * 60;
            num2 = num3 + num1 + second;
            System.out.println(hour + " hour * 3600 = " + num3);
            System.out.println(minute + " minute * 36 = " + num1);
            System.out.println(second +" second * 1 = " + second);
            System.out.println("Total = " + second + " + " + num1 +" + "+ num3 + " = " + num2);


            System.out.println("Do you want to convert another time? (y/n)");
            sc.nextLine();
            String choice2 = sc.nextLine();
            if(Objects.equals(choice2, "n")){
                run = false;
            }

            }
        System.out.println("Goodbye");
            }



        }

        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit

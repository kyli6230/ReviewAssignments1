package Part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        double hours, regpay, otpay, totalpay;
        double grandtotal = 0, grandregpay = 0, grandotpay = 0;
        final double reghour = 15, overhour = 22.50;
        Scanner s = new Scanner(System.in);

        //ask for hours worked
        for (int i = 1; i <= 5; i++) {
            while (true) {
                System.out.format("Enter hours worked for Employee %d: ", i);
                hours = s.nextDouble();
                if (hours >= 1 && hours <= 70) {
                    break;
                }
                System.out.println("Error, must be between 1 to 70");
                System.out.println("-------------------------");
            }
            if (hours > 40) {
                regpay = 40 * reghour;
                hours = hours - 40;
                otpay = hours * overhour;
                totalpay = regpay + otpay;
            } else {
                totalpay = regpay = hours * reghour;
                otpay = 0;
            }
            grandtotal += totalpay;
            grandregpay += regpay;
            grandotpay += otpay;
            
            System.out.format("Regular Pay: $%.2f\n", regpay);
            System.out.format("Overtime Pay: $%.2f\n", otpay);
            System.out.format("Total Pay: $%.2f\n", totalpay);
            System.out.println("-------------------------");
        }
        System.out.println("-------------------------");
        System.out.format("Grand Total Regular Pay: $%.2f\n", grandtotal);
        System.out.format("Grand Total Overtime Pay: $%.2f\n", grandregpay);
        System.out.format("Grand Total Total Pay: $%.2f\n", grandotpay);
    }
}

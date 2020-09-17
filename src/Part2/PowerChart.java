package Part2;

import java.util.Scanner;

public class PowerChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int exval, pow;
        while (true) {
            System.out.println("Enter exponent value: ");
            exval = s.nextInt();
            if (exval >= 1 && exval <= 10) {
                break;
            }
            System.out.println("Error, must be between 1 to 10");
        }

        //print column headings
        System.out.format("%5s", "X");
        System.out.format("%5s\n", "2^X");
        System.out.format("%5s", "=");
        System.out.format("%5s\n", "===");

        for (int i = 1; i <= exval; i++) {
            System.out.format("%5d", i);
            pow = (int) (Math.pow(2, i));
            System.out.format("%5d\n", pow);
        }
    }

}

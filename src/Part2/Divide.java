package Part2;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        int num1, num2, max, min;
        int full, remainder;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = s.nextInt();
        System.out.print("Enter num2: ");
        num2 = s.nextInt();
        max = (Math.max(num1, num2));
        min = (Math.min(num1,num2));
        full = max / min;
        remainder = max % min;
        System.out.format("The answer is: %dR %d\n",full,remainder);
        
    }
    
}

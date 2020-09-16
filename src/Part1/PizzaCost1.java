package Part1;


import java.util.Scanner;


public class PizzaCost1 {

    public static void main(String[] args) {
        double size, total;
        int toppings;
        final double labour = 1.5, gas = 0.75;
        
        Scanner s = new Scanner(System.in);
        //ask for pizza size and number of toppings
        System.out.print("Enter pizza size (in inches) -> ");
        size = s.nextDouble();
        System.out.print("Enter number of toppings -> ");
        toppings = s.nextInt();
        //calculate total
        total = labour + gas + (0.75 * toppings) + (0.50 * size);
        //print the answer
        System.out.println(String.format("The total cost is %.2f",total));
    }
    
}

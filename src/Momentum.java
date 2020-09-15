
import java.util.Scanner;


public class Momentum {

    public static void main(String[] args) {
        double momentum, mass, vel;
        Scanner s = new Scanner(System.in);
        //ask for mass and velocity
        System.out.print("Enter object's mass (in kg) -> ");
        mass = s.nextDouble();
        System.out.print("Enter object's velocity (in m/sec) -> ");
        vel = s.nextDouble();
        //calculate momentum
        momentum = mass * vel;
        //print the answer
        System.out.println(String.format("The object's momentum is %.2f",momentum));
    }
    
}

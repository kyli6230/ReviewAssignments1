import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart {

   //static = global vairable = can be used in ALL methods
    static SketchPadWindow spw = new SketchPadWindow(600, 600);
    static Pen p = new StandardPen(spw);
    public static void main(String[] args) {
        int value1, value2, value3, value4;
       
        Scanner s = new Scanner(System.in);
        //ask for pizza size and number of toppings
        System.out.print("Enter value 1 of 4 -> ");
        value1 = s.nextInt();
        System.out.print("Enter value 2 of 4 -> ");
        value2 = s.nextInt();
        System.out.print("Enter value 3 of 4 -> ");
        value3 = s.nextInt();
        System.out.print("Enter value 4 of 4 -> ");
        value4 = s.nextInt();   
        makeBar(-150,-225,value1,Color.blue);
        makeBar(-50,-225,value2,Color.red);
        makeBar(50,-225,value3,Color.green);
        makeBar(150,-225,value4,Color.yellow);
        makeLine();
    }
    public static void makeBar(int xloc, int yloc, int length, Color col) {
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setColor(col);
        p.setWidth(50);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(35);
        p.down();
        p.drawString(length + "");
    }
    public static void makeLine(){
        p.up();
        p.move(-200,-250);
        p.down();
        p.setColor(Color.black);
        p.setWidth(10);
        p.setDirection(0);
        p.move(400);
    }
}

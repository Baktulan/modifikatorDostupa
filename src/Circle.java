import java.util.Scanner;

public class Circle {
    private static double PI = Math.PI;
    private static double r;



    public double getPI() {
        return PI;

    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getR() {
        return r;
    }

    public void setR() {
        Scanner scanner= new Scanner(System.in);
        double r1= scanner.nextDouble();
        this.r = r1;
    }

    static void area(){

        double area= PI*(r*r);
        System.out.println("Area of circle = "+area);




    }
    static void circumference(){
        double circumference= PI*2*r;
        System.out.println("circumference of circle ="+ circumference);

    }
}

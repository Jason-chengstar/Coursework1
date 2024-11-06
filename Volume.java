import java.util.Scanner;

public class Volume {
    public static double sphere(double d) {
        double pi=Math.PI;
        double r=d/2;
        double v =  pi * Math.pow(r, 3)*4/3;
        return v;git
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diameter ");
        double diameter = in.nextDouble();
        double volume = sphere(diameter);
        System.out.println("Volume is " + volume);


    }
}

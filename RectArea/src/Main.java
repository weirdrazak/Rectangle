import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            double length, width, area;

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the length: ");
            length = scan.nextDouble();

            System.out.print("Enter the width: " );
            width = scan.nextDouble();

            area = length * width;
            System.out.println("Area of the rectangle is " + area);
    }
}
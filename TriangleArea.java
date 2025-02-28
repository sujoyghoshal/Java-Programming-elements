import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle in inches: ");
        double base = input.nextDouble();
        
        System.out.print("Enter height of the triangle in inches: ");
        double height = input.nextDouble();
        
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 cm²

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");
    }
}

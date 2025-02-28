import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and in sq inches is " + areaInches);
    }
}

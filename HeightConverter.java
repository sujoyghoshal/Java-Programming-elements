import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        
        double heightInches = heightCm / 2.54;
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;
        
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " feet and " + inches + " inches.");
        

    }
}

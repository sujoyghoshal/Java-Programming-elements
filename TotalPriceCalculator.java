import java.util.Scanner;

class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}

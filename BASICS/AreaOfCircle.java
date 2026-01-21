import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();
    System.out.println("Area of the circle with radius " + radius + " is: " + 3.14159 * radius * radius);
    System.out.println("Volume of the sphere with radius " + radius + " is: " + (4.0 / 3.0) * 3.14159 * radius * radius * radius);
}
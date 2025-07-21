import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value A: ");
        double A = getValidDouble(sc);

        System.out.print("Enter value B: ");
        double B = getValidDouble(sc);

        System.out.print("Enter value C: ");
        double C = getValidDouble(sc);

        double areaTriangle = (A * C) / 2;
        double areaCircle = Math.PI * C * C;
        double areaTrapezoid = (A + B) * C / 2;
        double areaSquare = B * B;
        double areaRectangle = A * B;

        System.out.println("-------------------------------");
        System.out.printf("Triangle: %.3f\n", areaTriangle);
        System.out.printf("Circle: %.3f\n", areaCircle);
        System.out.printf("Trapezoid: %.3f\n", areaTrapezoid);
        System.out.printf("Square: %.3f\n", areaSquare);
        System.out.printf("Rectangle: %.3f\n", areaRectangle);
        System.out.println("-------------------------------");
        sc.close();
    }

    public static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("invalid value!Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
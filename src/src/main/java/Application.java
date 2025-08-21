import entities.GeometricAreasCalculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeometricAreasCalculator calculator = new GeometricAreasCalculator();

        System.out.print("Enter value a: ");
        double a = getValidDouble(sc);

        System.out.print("Enter value b: ");
        double b = getValidDouble(sc);

        System.out.print("Enter value c: ");
        double c = getValidDouble(sc);

        double areaTriangle = calculator.areaTriangle(a, b);
        double areaCircle = calculator.areaCircle(c);
        double areaTrapezoid = calculator.areaTrapezoid(a, b, c);
        double areaSquare = calculator.areaSquare(b);
        double areaRectangle = calculator.areaRectangle(a, b);

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
package entities;

public class GeometricAreasCalculator {

    public double areaTriangle(double a, double b) {
        return a * b / 2;
    }

    public double areaCircle(double c) {
        return Math.PI * c * c;
    }

    public double areaTrapezoid(double a, double b, double c) {
        return (a + b) * c / 2;
    }

    public double areaSquare(double b) {
        return b * b;
    }

    public double areaRectangle(double a, double b) {
        return a * b;
    }

}

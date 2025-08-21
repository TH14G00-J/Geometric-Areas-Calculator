import entities.GeometricAreasCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricAreasCalculatorTest {

    @Test
    void mustCalculateTriangleAreaCorrectly() {
        GeometricAreasCalculator calculator = new GeometricAreasCalculator();
        assertEquals(12.5, calculator.areaTriangle(5, 5));
    }

    @Test
    void mustCalculateCircleAreaCorrectly() {
        GeometricAreasCalculator calculator = new GeometricAreasCalculator();
        assertEquals(78.540, calculator.areaCircle(5), 0.001);
    }

    @Test
    void mustCalculateTrapezoidAreaCorrectly() {
        GeometricAreasCalculator calculator = new GeometricAreasCalculator();
        assertEquals(27.000, calculator.areaTrapezoid(4, 5, 6), 0.001);
    }

    @Test
    void mustCalculateSquareAreaCorrectly() {
        GeometricAreasCalculator calculator = new GeometricAreasCalculator();
        assertEquals(25.000, calculator.areaSquare(5), 0.001);
    }

    @Test
    void mustCalculateRectangleAreaCorrectly() {
        GeometricAreasCalculator calculator = new GeometricAreasCalculator();
        assertEquals(20.000, calculator.areaRectangle(4, 5), 0.001);
    }

}

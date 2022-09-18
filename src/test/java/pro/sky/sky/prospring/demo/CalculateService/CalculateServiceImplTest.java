package pro.sky.sky.prospring.demo.CalculateService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceImplTest {




    @Test
    public void plusTest() {
        Integer a = 15;
        Integer b = 4;
        CalculateService calculateService = new CalculateServiceImpl();
        Integer actual = calculateService.plus(a, b);
        Integer expected = a + b;
        assertEquals(actual, expected);
    }


    @Test
    void minusTest() {
        Integer a = 15;
        Integer b = 4;
        CalculateService calculateService = new CalculateServiceImpl();
        Integer actual = calculateService.minus(a, b);
        Integer expected = a - b;
        assertEquals(actual, expected);
    }

    @Test
    void multiTest() {
        Integer a = 15;
        Integer b = 4;
        CalculateService calculateService = new CalculateServiceImpl();
        Integer actual = calculateService.multi(a, b);
        Integer expected = a * b;
        assertEquals(actual, expected);
    }

    @Test
    void divideTest() {
        Integer a = 15;
        Integer b = 4;
        CalculateService calculateService = new CalculateServiceImpl();
        Double actual = Double.valueOf(calculateService.divide(a, b));
        Double expected = Double.valueOf(a / b);
        assertEquals(actual, expected);
    }

    @Test
    void divideForNullTest()  {
        Integer a = 15;
        Integer b = 0;
        CalculateService calculateService = new CalculateServiceImpl();
        assertThrows(IllegalArgumentException.class, ()->  calculateService.divide(a, b));
    }
}

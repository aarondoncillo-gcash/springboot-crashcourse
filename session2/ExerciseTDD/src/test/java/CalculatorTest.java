import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp(){
         calculator = new Calculator();
    }

    @Test
    void testIntAdd(){
        int sum = calculator.add(2, 8);
        assertEquals(10, sum);
    }

    @Test
    void testLongAdd(){
        long sum = calculator.add(10L, 20L);
        assertEquals(30L, sum);
    }

    @Test
    void TestShortAdd(){
        short sum = calculator.add((short)25, (short)35);
        assertEquals(60, sum);
    }

    @Test
    void testFloatSum() {
        float sum = calculator.add(1.1f,5.6f);
        assertEquals(6.7, sum, .001);
    }

    @Test
    void testDoubleSum(){
        double sum = calculator.add(13.2,12.1);
        assertEquals(25.3, sum, 0.001);
    }

    @Test
    void testIntMinus(){
        int difference = calculator.minus(8, 2);
        assertEquals(6, difference);
    }

    @Test
    void testLongMinus(){
        long difference = calculator.minus(20L, 5L);
        assertEquals(15L, difference);
    }

    @Test
    void TestShortMinus(){
        short difference = calculator.minus((short)35, (short)25);
        assertEquals(10, difference);
    }

    @Test
    void testFloatMinus() {
        float difference = calculator.minus(5.6f,1.3f);
        assertEquals(4.3, difference, .001);
    }

    @Test
    void testDoubleMinus(){
        double difference = calculator.minus(13.2,12.1);
        assertEquals(1.1, difference, 0.001);
    }

    @Test
    void testIntDivide(){
        int quotient = calculator.divide(8, 2);
        assertEquals(4, quotient);
    }

    @Test
    void testLongDivide(){
        long quotient = calculator.divide(20L, 5L);
        assertEquals(4L, quotient);
    }

    @Test
    void TestShortDivide(){
        short quotient = calculator.divide((short)12, (short)3);
        assertEquals(4, quotient);
    }

    @Test
    void testFloatDivide() {
        float quotient = calculator.divide(5.6f,1.3f);
        assertEquals(4.3076, quotient, .001);
    }

    @Test
    void testDoubleDivide(){
        double quotient = calculator.divide(13.2,12.1);
        assertEquals(1.0909, quotient, 0.001);
    }

    @Test
    void testDividebyZeroIntDivide(){
        ArithmeticException thrown = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0),
                "Expected divide() to throw IllegalArgumentException, but it didn't"
        );

        assertEquals("/ by zero", thrown.getMessage());
    }

    @Test
    void testDividebyZeroFloatDivide(){
        assertEquals(Float.POSITIVE_INFINITY, calculator.divide(13.0f, 0));
    }

    @Test
    void testDividebyZeroDoubleDivide(){

        assertEquals(Float.POSITIVE_INFINITY, calculator.divide(5.0, 0));
    }

    @Test
    void testIntMulitply(){
        int product = calculator.multiply(8, 2);
        assertEquals(16, product);
    }

    @Test
    void testLongMulitply(){
        long product = calculator.multiply(20L, 5L);
        assertEquals(100L, product);
    }

    @Test
    void TestShortMultiply(){
        short product = calculator.multiply((short)3, (short)12);
        assertEquals(36, product);
    }

    @Test
    void testFloatMultiply() {
        float product = calculator.multiply(5.6f,1.3f);
        assertEquals(7.28, product, .001);
    }

    @Test
    void testDoubleMultiply(){
        double product = calculator.multiply(13.2,12.1);
        assertEquals(159.72, product, 0.001);
    }

    @Test
    void shouldBeTurnedOff() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isOn());

    }

    @Test
    void shouldTurnOn() {
        Calculator calculator = new Calculator();
        calculator.turnOn();
        assertTrue(calculator.isOn());

    }

    @Test
    void shouldTurnOff() {
        Calculator calculator = new Calculator();

        calculator.turnOn();
        assertTrue(calculator.isOn());

        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldBeTurnedOffAfterOpened() {
        Calculator calculator = new Calculator();

        calculator.turnOn();
        assertFalse(calculator.isOff());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }








}

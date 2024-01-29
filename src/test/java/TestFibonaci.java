import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestFibonaci {
    private App main = new App();
    @Test
    @DisplayName("Fibonaci Test 0")
    void testFibbonaci(){
        int[] returned = App.fibonaciCalculator(0);
        assertNull(returned);
    }
    @Test
    @DisplayName("Fibonaci Test 1")
    void testFibbonaci1(){
        int[] expected = {0};
        int[] returned = main.fibonaciCalculator(1);
        assertArrayEquals(expected,returned);
    }
    @Test
    @DisplayName("Fibonaci Test 5")
    void testFibbonaci5(){
        int[] expected = {0,1,1,2,3};
        int[] returned = main.fibonaciCalculator(5);
        assertArrayEquals(expected,returned);
    }


}

package averagemethodjunit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("AverageMethod Testing")
public class AverageMethodTest {
    @Test
    @DisplayName("Tests the sum of 3 integers")
    public void testSum() {
        assertEquals(24, AverageMethod.sum(4, 8, 12));
        assertEquals(4, AverageMethod.sum(0, 1, 3));
        assertEquals(23, AverageMethod.sum(7, 5, 11));
    }

    @Test
    @DisplayName("Tests the average value of 3 integers")
    public void testAverage() {
        assertEquals(6.0, AverageMethod.average(6, 6, 6));
        assertEquals(5.0, AverageMethod.average(4, 6, 5));
    }
}

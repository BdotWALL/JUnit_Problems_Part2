package dividemethodjunit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("DivideMethod Testing")

public class DivideMethodTest {

    @Test
    @DisplayName("Tests the quotient of 2 numbers")
    public void divide() {
        assertEquals(4.0, DivideMethod.divide(32, 8));
        assertEquals(3, DivideMethod.divide(3, 1));
        assertEquals(10.0, DivideMethod.divide(70.0, 7.0));
    }


}
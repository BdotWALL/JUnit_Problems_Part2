package tacoboxesjunit5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("TripleTacoBox Testing")

public class TripleTacoBoxTest {

    @Test
    @DisplayName("Test to make sure TripleTacoBox created with 3 tacos")
     public void TripleTacoBox() {
        TripleTacoBox box = new TripleTacoBox();
        assertEquals(3, box.tacosRemaining());
    }


    @Test
    @DisplayName("Test to make sure eat method removes one taco from the box")
     public void eat() {
        TripleTacoBox box = new TripleTacoBox();
        box.eat();
        assertEquals(2, box.tacosRemaining());
    }

}

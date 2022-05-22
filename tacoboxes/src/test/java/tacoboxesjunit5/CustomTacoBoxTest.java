package tacoboxesjunit5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("CustomTacoBox Testing")

public class CustomTacoBoxTest {

    @Test
    @DisplayName("Test to make sure CustomTacoBox is created with a specified number of tacos")
     public void TripleTacoBox() {
        CustomTacoBox box = new CustomTacoBox(7);
        assertEquals(7, box.tacosRemaining());
    }


    @Test
    @DisplayName("Test to make sure eat method removes one taco from the box")
     public void eat() {
        CustomTacoBox box = new CustomTacoBox(7);
        box.eat();
        box.eat();
        assertEquals(5, box.tacosRemaining());
    }

}

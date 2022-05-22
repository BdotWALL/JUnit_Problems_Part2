package interfaceinaboxjunit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Box Testing")

public class BoxTest {

    @Test
    @DisplayName("Tests that add method is adding to box")
    public void add() {
        Box smallBox = new Box(6);
        smallBox.add( new Book("Horstman", "Core Java", 5) );
        smallBox.add( new CD("Future", "I Never Liked You", 2022));
        assertEquals(5.1, smallBox.weight());
   
    }


}
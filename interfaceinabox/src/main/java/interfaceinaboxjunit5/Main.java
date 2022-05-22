package interfaceinaboxjunit5;

public class Main {
    public static void main(String[] args) throws Exception {
        Box smallBox = new Box(6);
        Box mediumBox = new Box(15);
        Box largeBox = new Box(21);

        smallBox.add( new Book("Horstman", "Core Java", 5) );
        smallBox.add( new CD("Future", "I Never Liked You", 2022));
        smallBox.add( new CD("Kendrick Lamar", "Mr. Morale & The Big Steppers", 2022));
        smallBox.add( new CD("Pusha T", "Its Almost Dry", 2022));
        smallBox.add( new CD("BabyFace Ray", "FACE", 2022));
        smallBox.add( new CD("Doeboy", "Oh Really", 2022));
        
        System.out.println(smallBox);
        mediumBox.add(smallBox);
        mediumBox.add(new Book("Green", "The 48 Laws of Power", 7));
        largeBox.add(mediumBox);
        largeBox.weight();
        System.out.println(largeBox);


    }
}

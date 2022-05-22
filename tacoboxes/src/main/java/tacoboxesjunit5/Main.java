package tacoboxesjunit5;

public class Main {
    public static void main(String[] args) throws Exception {

        CustomTacoBox box1 = new CustomTacoBox(5);
        System.out.println(box1.tacosRemaining());
        box1.eat();
        box1.eat();
        System.out.println(box1.tacosRemaining());

        TripleTacoBox box2 = new TripleTacoBox();
        System.out.println(box2.tacosRemaining());
        box2.eat();
        box2.eat();
        System.out.println(box2.tacosRemaining());


    }
}

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("carmel", 9, 2);
        cat1.speak();
        cat1.eat(0.50);

        System.out.println(cat1.getFood());
    }
}
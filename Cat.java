/**
 * Cat
 */
public class Cat extends dog {
    private double food;

    public Cat(String name, int age, double food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name) {
        super(name, 0);
    }

    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I am " + this.age + " old. I eat " + this.food
                + " cups a food a day! Meow...");
    }

    public void eat(double x) {
        this.food -= x;
    }

    public double getFood() {
        return this.food;
    }

}
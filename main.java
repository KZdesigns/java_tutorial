/**
 * main
 */
public class main {

    public static void main(String[] args) {
        dog dog1 = new dog("Wrigley", 1);
        dog1.speak();
        int dog1Age = dog1.getAge();
        dog1.setAge(2);
        dog1.speak();
    }
}
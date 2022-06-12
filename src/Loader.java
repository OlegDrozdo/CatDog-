public class Loader {
    public static void main(String[] args) {
        String str = "Hi!";
        Dog dog1 = new Dog();
        System.out.printf("the weight Dog N1: %.2f %n", dog1.getWeight());
        dog1.feed(200.0);
        dog1.woof();
        System.out.printf("the weight Dog N1 after feeding: %.2f %n", dog1.getWeight());
    }
}

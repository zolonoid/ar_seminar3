package OCP;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public String sound() {
        return "мяу";
    }
}

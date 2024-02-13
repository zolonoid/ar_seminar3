package OCP;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public String sound() {
        return "гав";
    }
}

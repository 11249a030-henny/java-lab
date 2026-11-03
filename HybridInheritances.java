interface Animal {
    void eat();
}
interface Dog extends Animal {
    void bark();
}
interface Cat extends Animal {
    void meow();
}
class Pet implements Dog, Cat {
    public void eat() {
        System.out.println("Animal eats");
    }
    public void bark() {
        System.out.println("Dog barks");
    }
    public void meow() {
        System.out.println("Cat meows");
    }
}
public class HybridInheritances {
    public static void main(String[] args) {

        Pet obj = new Pet();
        obj.eat();
        obj.bark();
        obj.meow();
    }
}

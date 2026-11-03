class Animal {

    final void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {

    void display() {
        System.out.println("Dog is a domestic animal");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.display();
    }
}

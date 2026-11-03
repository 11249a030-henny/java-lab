interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Father's property");
    }

    public void motherProperty() {
        System.out.println("Mother's property");
    }
}
public class MultipleInheritances {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.fatherProperty();
        obj.motherProperty();
    }
}

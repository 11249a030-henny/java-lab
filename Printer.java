interface ScannerDevice {
    void scan();
}

class Machine implements ScannerDevice {

    void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Printer {

    public static void main(String[] args) {

        Machine m = new Machine();

        m.print();
        m.scan();
    }
}

import java.util.GregorianCalendar;

class GregorianDemo {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();

        System.out.println("Year: " + g.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (g.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + g.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

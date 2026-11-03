class Student
{
    String name;
    static int count = 0;

    Student(String name)
    {
        this.name = name;
        count++;
    }

    void display()
    {
        System.out.println("Student name: " + name);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("ram");
        Student s2 = new Student("ramesh");
        Student s3 = new Student("suresh");

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total students: " + Student.count);
    }
}


class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n) {
        name = n;
    }

    // Another Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Rahul");

        Student s3 = new Student("Aman", 20);

        s1.show();
        s2.show();
        s3.show();
    }
}

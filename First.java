class Student {
    int rn;
    String name;
    float marks;

    Student() {
        this(13, "Yash", 87.5f);
    }

    // Student() {
    // this.rn = 7;
    // this.name = "KK";
    // this.marks = 89.6f;
    // }

    Student(int rn, String name, float marks) {
        this.rn = rn;
        this.name = name;
        this.marks = marks;
    }

    // copy constructor
    Student(Student other) {
        this.rn = other.rn;
        this.name = other.name;
        this.marks = other.marks;
    }

    void changeName(String name) {
        this.name = name;
    }

}

class A {

    A() {
        System.out.println("Object is created");
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

public class First {
    public static void main(String[] args) {
        // System.out.println("Hello");
        // Student krishna = new Student();
        // krishna.changeName("Krishna Kotgire");
        // System.out.println(krishna.rn);
        // System.out.println(krishna.name);
        // System.out.println(krishna.marks);
        // Student random = new Student(krishna);
        // System.out.println(random.rn);
        // System.out.println(random.name);
        // System.out.println(random.marks);
        A obj;
        for (int i = 0; i < 100; i++) {
            obj = new A();
        }
    }

}

// 42.38 completed
// java is statically typed
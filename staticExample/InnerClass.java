package staticExample;

public class InnerClass {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Krishna");
        Test b = new Test("Aniket");
        System.out.println(a);
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

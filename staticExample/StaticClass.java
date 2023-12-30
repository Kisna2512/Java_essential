package staticExample;

public class StaticClass {
    static int a = 5;
    static int b = 1;

    static {
        System.out.println("I'm in static block");
        b = b + a;
    }

    public static void main(String[] args) {
        System.out.println(StaticClass.a + " " + StaticClass.b);
        System.out.println(StaticClass.a + " " + StaticClass.b);
    }
}

package staticExample;

public class Main {
    public static void main(String[] args) {
        // Human krishna = new Human(21, "Krishna Kotgire", 120000);
        // Human kartik = new Human(21, "Kartik Ahire", 120000);
        // System.out.println(Human.population);
        // System.out.println(Human.population);
        Main m = new Main();
        m.fun2();
    }

    // static void fun() {
    // greetings();
    // }
    // non-static
    void fun2() {
        greetings();
    }

    // non-static method
    void greetings() {
        System.out.println("Good Morning!!!");
    }

}

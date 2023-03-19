
class Area {
    int length;
    int bredth;

    public Area() {
        length = 5;
        bredth = 5;
    }

    void setLength(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    int calculateArea() {
        return length * bredth;
    }

}

public class classes_in_java {
    public static void main(String[] args) {
        Area a = new Area();
        a.setLength(4, 5);
        System.out.println(a.calculateArea());
    }
}

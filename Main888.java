class Test {
    static int x = 10;   // static variable

    void show() {
        this.x = 30;     // accessing static variable using this
        System.out.println(this.x);
    }
}

public class Main888 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}

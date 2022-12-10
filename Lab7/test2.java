class SuperClass {
    int x = 2;
}

class SubClass extends SuperClass {
    int x = 3;

    SubClass() {
        super.x = 4;
    }
}

public class test2 {
    public static void main(String[] args) {
        SuperClass sc = new SuperClass();
        SubClass sb = new SubClass();
        System.out.println(sb.x);
        System.out.println(sc.x);
        System.out.println(sc.super.x);
    }
}

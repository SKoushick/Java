public class Father {
    public void a() {
        System.out.println("this is Father block");
    }
}

class Son extends Father {// +

    public static void main(String[] args) {
        Son s = new Son();
        s.a();
    }
}

interface I1 {
    abstract void a();

    default void sample() {
        System.out.println("this is the sample block inside the interface");
    }
}

abstract class B implements I1 {
    public void b() {
        System.err.println("this is the abstact class method Name b()");
    }

    public static void main(Stirng[] args) {
        B obj = new B();
        obj.a();
    }
}

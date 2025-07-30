import java.util.function.*;
import java.rmi.server.Operation;
import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ar.add(i + 1);
        }

        ar.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        ar.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        LambdaFunction Mycalculator = new LambdaFunction();

        System.out.println(Mycalculator.operate(34, 56, sum));
        System.out.println(Mycalculator.operate(23, 43, product));
    }

    /*
     * int sum(int a, int b) {
     * return a + b;
     * }
     */

    private int operate(int a, int b, Operation op) {
        return op.Operation(a, b);
    }

}

interface Operation {
    int Operation(int a, int b);
}
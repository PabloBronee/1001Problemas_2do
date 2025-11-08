import java.util.concurrent.atomic.AtomicInteger;

public class Problema312 {

    static void intercambiar(AtomicInteger a, AtomicInteger b) {
        int temp = a.get();
        a.set(b.get());
        b.set(temp);
    }

    public static void main(String[] args) {
        AtomicInteger x = new AtomicInteger(5);
        AtomicInteger y = new AtomicInteger(10);

        intercambiar(x, y);

        System.out.println("x = " + x.get() + ", y = " + y.get());
    }
}


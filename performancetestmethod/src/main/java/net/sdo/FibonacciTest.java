package net.sdo;

import java.util.Random;

/**
 * {@link FibonacciTest} 微基准测试
 */
public class FibonacciTest {

    private volatile double l;
    private int nLoops;
    private int[] input;

    public FibonacciTest(int n) {
        this.nLoops = n;
        this.input = new int[this.nLoops];
        Random r = new Random();
        for (int i = 0; i < this.nLoops; i++) {
            this.input[i] = r.nextInt(30);
        }
    }

    public double fibImpl1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Must be > 0");
        }
        if (n > 1476) {
            throw new ArithmeticException("Must be < 1476");
        }
        if (n == 0) return 0d;
        if (n == 1) return 1d;
        double d = fibImpl1(n - 2) + fibImpl1(n - 1);
        if (Double.isInfinite(d)) {
            throw new ArithmeticException("Overflow");
        }
        return d;
    }

    private void doTest(boolean isWarmUp) {
        long then = System.currentTimeMillis();
        for (int i = 0; i < this.nLoops; i++) {
            this.l = fibImpl1(this.input[i]);
        }
        if (!isWarmUp) {
            long now = System.currentTimeMillis();
            System.out.println("Elapsed time:" + (now - then) + "ms");
        }
    }

    public static void main(String[] args) throws Exception {
        FibonacciTest ft = new FibonacciTest(30000);
        ft.doTest(true);
        ft.doTest(false);
    }

}

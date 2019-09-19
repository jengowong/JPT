package net.sdo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link FibonacciTest1} 微基准测试
 */
public class FibonacciTest1 {

    @Before
    public void before() {
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
    }

    @After
    public void after() {
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
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

    @Test
    public void doTest1() {
        double l;
        long then = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            l = fibImpl1(30);
        }
        long now = System.currentTimeMillis();
        System.out.println("Elapsed time:" + (now - then) + "ms");
    }

}

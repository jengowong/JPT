package net.sdo;

public class Test_1 {

    public static void main(String[] args) throws Exception {
        System.out.println(0.06 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(303.1 / 1000);
        System.out.println();
        System.out.println(Arith.add(0.06, 0.01));
        System.out.println(Arith.sub(1.0, 0.42));
        System.out.println(Arith.mul(4.015, 100));
        //System.out.println(Arith.div(303.1d, 1000d, 10));
    }

}

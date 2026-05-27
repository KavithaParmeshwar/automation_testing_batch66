package mkt.automation;

public class CallStaticPara5 {

	public static void main(String[] args) {

        // addExact methods
        int addInt = Math.addExact(01, 16);
        long addLong = Math.addExact(10000000000L, 20000000000L);

        // subtractExact methods
        int subInt = Math.subtractExact(50, 33);
        long subLong = Math.subtractExact(50000000000L, 20000000000L);

        // multiplyExact methods
        int mulInt = Math.multiplyExact(3, 3);
        long mulLongInt = Math.multiplyExact(100000L, 5);
        long mulLongLong = Math.multiplyExact(2000000000L, 3L);

        // abs methods
        int absInt = Math.abs(-(-25));
        double absDouble = Math.abs(-45.67);
        float absFloat = Math.abs(-12.5f);
        long absLong = Math.abs(-987654321L);

        System.out.println(addInt);
        System.out.println(addLong);

        System.out.println(subInt);
        System.out.println(subLong);

        System.out.println(mulInt);
        System.out.println(mulLongInt);
        System.out.println(mulLongLong);

        System.out.println(absInt);
        System.out.println(absDouble);
        System.out.println(absFloat);
        System.out.println(absLong);
    }
}
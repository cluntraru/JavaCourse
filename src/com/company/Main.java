package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        // Car *car; -- closest thing in c++
        Car car2 = new Car();
        car.Vroom();

        int x = 2;
        // x.toString(); -- will not compile, not an object
        Integer xObj = 2;
        xObj.toString();
        Object o = x;
        System.out.println(xObj);

        // Primitive data types
        int integer = 3; // Positive & negative integer numbers in range [-pow(2, 31), pow(2, 31) - 1]
        // int y = 1000000000000; -- too large?
        // integers are representate pe 4B == 32b
        // 0 in memory
        // 00000000 00000000 00000000 00000000
        // 1 in memory
        // 00000000 00000000 00000000 00000001
        // 2 in memory
        // 00000000 00000000 00000000 00000010
        // Conversion from binary to decimal
        // 10010 == pow(2, 0) * 0 + pow(2, 1) * 1 + pow(2, 2) * 0 + pow(2, 3) * 0 + pow(2, 4) * 1

        // Negative numbers - sign bit
        // 1 ... means negative
        // 0 ... means non-negative
        // pow(2, 31) - 1 is the largest int. Why?
        // 01111111 11111111 11111111 11111111
        // sum(pow(2, 0) ... pow(2, 30)) == (math formula) => pow(2, 31) - 1

        // Alternative calculation
        // 1000000000...0 (=2^31) - 1 ==
        // 0111111111

        // Real numbers
        float y = 2.3f;
        // Why float? Floating point
        // Not 100% precise, be VERY careful when making precise calculations
        double z = 2.3f; // Double precision (also double size)

        // Boolean: true or false
        // boolean b = true; // false
        // An entire byte 00000001/00000000
        boolean b = y == z - 1;
        System.out.println(b);

        // Characters
        char c = 'H';
        System.out.println(c);

        // Strings
        String str = "3";

        // Comparing equality
        System.out.println(car.equals(car2));
    }
}

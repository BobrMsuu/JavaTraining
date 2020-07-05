package oop;

import java.util.function.BinaryOperator;

public class InterfaceApply {

    public static void main(String[] args) {
        BinaryOperator<Integer> combiner = Math::max;

        System.out.println();
    }
}

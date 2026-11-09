package Functional_Interfaces;

import java.util.function.BinaryOperator;

public class BinaryImpl {

    static void main(String[] args) {
        BinaryOperator<String>checker = (value1,value2)->{return value1+value2;};

        System.out.println(checker.apply("dan","ben"));
    }
}

package Functional_Interfaces;

import java.util.function.UnaryOperator;

public class UnaryImpl {

    static void main(String[] args) {

        UnaryOperator<String> checker = (value)->value ;

        System.out.println(checker.apply("Hello"));

    }




}

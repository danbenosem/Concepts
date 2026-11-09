package Functional_Interfaces;

import java.util.function.BiPredicate;

public class BiPredicateImpl {

    static void main(String[] args) {

        BiPredicate<String,Integer> checker = (value,number)-> value.length() == number;

        System.out.println(checker.test("Hello",10));
    }


}

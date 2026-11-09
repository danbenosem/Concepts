package Functional_Interfaces;

import java.util.function.Predicate;

public class PredicateImpl {


    static void main(String[] args) {
        Predicate<String> predicate = (value) -> {

            if (value.length() > 2) return true;
            return false;
        };

        System.out.println(predicate.test("Hello"));
    }

}
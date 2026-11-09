package Functional_Interfaces;

import java.util.function.BiFunction;

public class BiFunctionImpl {



    static void main(String[] args) {
        BiFunction<String ,String,String> dan= (param1,param2)-> param1+""+param2;
        System.out.println( dan.apply("dan","Ben"));
    }


}

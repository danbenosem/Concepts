package Functional_Interfaces;


import java.util.function.Function;

public class FunctionImpl {

//   Function<Integer, Integer> function;

   static void main(String[] args) {

      Function<Integer,String> dan = (number)->"number is"+number ;

      System.out.println(dan.apply(10));

   }




}

package Regex;

public class Regex {


    public static boolean emailValidation(String email){

        String regex = "^[A-Za-z]{1}\\.[A-za-z]+@native\\.semicolon\\.africa$";
        return email.matches(regex);
    }

    public static boolean passwordValidation(String password){

        String regex = "^(?=.*\\d)(?=.*[a-zA-Z])\\S{8,16}$";

        return password.matches(regex);
    }
}

package de.neuefische;

public class FizzBuzz {


    public static String play(int input) {
        if (input%3==0 && input%5==0){
            return "FIZZBUZZ";
        } else if (input%5==0) {
            return "BUZZ";
        } else if (input%3==0) {
            return "FIZZ";
        }
        return ""+input;
    }

    public static boolean isEven(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
}

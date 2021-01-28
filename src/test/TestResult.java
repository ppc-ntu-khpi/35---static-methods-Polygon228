package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String first = "water";
        String second = "reTaw";
        System.out.printf("Word '%s' is anagram of '%s' - %b", first, second, Exercise.Calculate(first, second));
        
    }
}

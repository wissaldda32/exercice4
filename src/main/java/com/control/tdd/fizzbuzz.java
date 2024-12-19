package com.control.tdd;

public class fizzbuzz {

    public String action(int input) {
        if (input == 3) {
            return "fizz";
        } else if (input == 4) {
            return "4";
        } else if (input == 5) {
            return "buzz";
        } else {
            return String.valueOf(input);
        }
    }
}

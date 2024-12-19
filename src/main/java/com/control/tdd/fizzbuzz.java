package com.control.tdd;

public class fizzbuzz {

    public String action(int input) {
        if (input % 3==0) {
            return "fizz";
        }
        else if (input %5==0) {
            return "buzz";
        }
            return input +"";

    }
}

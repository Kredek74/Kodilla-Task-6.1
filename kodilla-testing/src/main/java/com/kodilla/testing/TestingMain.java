package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addResult = 12;
        int subtractResult = 8;

        if (addResult == calculator.additionAtoB(7, 5)){
            System.out.println("Addition works");
        } else {
            System.out.println("Error of method add");
        }
        if (subtractResult == calculator.substractionAfromB(14, 6)) {
            System.out.println("Substraction works");
        } else {
            System.out.println("Error of method subtract");
        }
    }
}

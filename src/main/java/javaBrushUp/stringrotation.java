package main.java.javaBrushUp;

import java.util.LinkedHashMap;

public class stringrotation {

    public static void main(String[] args) {

        String burn = "yo momma";

        String notburn = "ayo momm";

        stringChecker(burn, notburn);

    }

    public static boolean stringChecker(String input1, String input2) {

        if (input1 == null || input2 == null) {
            System.out.println("input null");
            return false;

        }

        if (input1.length() != input2.length()) {
            System.out.println("length doesn't match");
            return false;

        }

        if (input1.isEmpty() || input2.isEmpty()) {
            System.out.println("input empty");
            return false;

        }

        int firstIndex = -1;

        StringBuilder test = new StringBuilder();
        for (int i = 0; i < input1.length(); i++) {

            firstIndex = input2.indexOf(input1.charAt(i));
            break;
        }

        for (int i = 0; i < input1.length(); i++) {
            int secondIndex = (firstIndex + i) % input2.length();
            if (input1.charAt(i) == input2.charAt(secondIndex)) {
                test.append(input2.charAt(secondIndex));
            }
            if (input1.charAt(i) != input2.charAt(secondIndex)) {
                System.out.println("in loop false");
                return false;
            }
        }

        if (input1.equals(test.toString())) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
        // String doubled = input1+input1;

        // if (doubled.contains(input2)) {
        // System.out.println("true");
        // return true;
        // }

        // System.out.println("false");
        // return false;

    }

}
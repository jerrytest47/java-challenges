package main.java.javaBrushUp;

import java.util.LinkedHashMap;

public class secondnonrepeating {
    
public static void main(String[] args) {
    String input = "aabbccdeffgghi";
}

public static char stringParser(String input){

     if (input==null) {
        System.out.println("not a valid string");
        return '\0';
    }

    if (input.isBlank() || input.isBlank()) {
        System.out.println("not a valid string");
        return '\0';
    }

    LinkedHashMap<Character,Integer> solution = new LinkedHashMap<>();



    char[] charSolution = new char[2];
    int counter = 0;

    for(int i = 0; i<input.length();i++){
      
       solution.put(input.charAt(i), solution.getOrDefault(input.charAt(i), 0)+1 );

    }



    return '\0';
}

}

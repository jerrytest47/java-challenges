package main.java.javaBrushUp;

import java.util.LinkedHashMap;
import java.util.Map;

public class secondnonrepeating {
    
public static void main(String[] args) {
    String input = "aabbccdeffgghi";
    System.out.println(stringParser(input));
}

public static char stringParser(String input){

     if (input==null) {
        System.out.println("not a valid string");
        return '\0';
    }

    if (input.isBlank() || input.isEmpty()) {
        System.out.println("not a valid string");
        return '\0';
    }

    LinkedHashMap<Character,Integer> solution = new LinkedHashMap<>();



    char[] charSolution = new char[2];
    int counter = 0;

    for(int i = 0; i<input.length();i++){
      
       solution.put(input.charAt(i), solution.getOrDefault(input.charAt(i), 0)+1 );

    }

    for(Map.Entry<Character,Integer> entry : solution.entrySet() ){
    Character Key = entry.getKey();
    Integer Value = entry.getValue();
    if(counter>1){
        break;
    }
    if (Value == 1) {
        charSolution[counter] = Key;
        counter++;
        System.out.println("Key: "+Key+" " + "Value: "+ Value);
    }
    }



    return charSolution[1];
}

}

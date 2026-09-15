package main.java.javaBrushUp;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstnonrepeating {
    
public static void main(String[] args) {
    
    String word = "aabbccddefghhi";
    System.out.println(firstnonrepeating(word));

}

public static char firstnonrepeating(String s){

        if(s == null || s.isEmpty()){
            return '\0';
        }
    LinkedHashMap<Character,Integer> chars = new LinkedHashMap<>();

    for(int i=0; i<s.length();i++){
        chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i), 0)+1);

    }

    for(Map.Entry<Character,Integer> entry: chars.entrySet()){

        Character key = entry.getKey();
        Integer value = entry.getValue();
        if (value==1) {
            return key;
        }
    }



    return '\0';
}

}

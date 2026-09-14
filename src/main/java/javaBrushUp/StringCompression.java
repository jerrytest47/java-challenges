package javaBrushUp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String abc = "aabccddd";
        System.out.println(compressionCheck(abc));
    }

    public static String compressionCheck(String s){
        if(s.isBlank()||s.isEmpty() || s == null) {
            return "invalid input detected";
        }

        StringBuilder compressed = new StringBuilder();
        // char[] sChars = s.toCharArray();

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        // for(int i=0; i<s.length();i++){

        //         charCount.put(sChars[i], charCount.getOrDefault(sChars[i], 0)+1);
            
        // }

        for (char c: s.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            Character key = entry.getKey();
            compressed.append(key);
            String value = entry.getValue().toString();
            compressed.append(value);

        }
        System.out.println(compressed);
        if (compressed.toString().length()<= s.length()) {
            return compressed.toString();
        }
        return s;
    }
}

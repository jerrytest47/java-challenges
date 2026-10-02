package main.java.javaBrushUp;

import java.util.HashSet;

public class DuplicateFinder {
    
    public static void main(String[] args) {
        String[] ids = {"TX100", "TX101", "TX102", "TX100", "TX102","TX103"};
        System.out.println(dupeFinder(ids));
    }

    public static String dupeFinder(String[] input){

        HashSet<String> uniqueSet = new HashSet<>();
        StringBuilder dupes = new StringBuilder();
        for(int i=0; i<input.length; i++){
            if (!uniqueSet.add(input[i])) {
               dupes.append(input[i]+" "); 
            }
        }
        return dupes.toString();
    }
}

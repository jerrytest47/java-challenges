package main.java.javaBrushUp;

import java.util.HashMap;

public class CSVParse {
//     CSV Transaction Parser — Easy
// You're given:
// 1001,APPROVED,24.99
// 1002,DECLINED,15.50
// 1003,APPROVED,100.00
// 1004,APPROVED,7.25

// Parse the data and return the total dollar amount of APPROVED transactions.



public static void main(String[] args) {
     String csvInput = "1001,APPROVED,24.99\r\n" + //
                  "1002,DECLINED,15.50\r\n" + //
                  "1003,APPROVED,100.00\r\n" + //
                  "1004,APPROVED,7.25";
                  System.out.println(parseCSV(csvInput));
}

public static double parseCSV(String input){
    //solution
    double Solution = 0;
    String[] parsed =  input.split("\\r\\n");
    //for loop
    
    //Original Solution:
    //   for(int j =0; j<parsed.length; j++){
    //     String parsed2 = parsed[j].substring(5);
    //     int slashIndex = parsed2.indexOf("/");
    //     String parsed3 = (slashIndex != -1) ? parsed2.substring(0,slashIndex):parsed2;
    //     String[] parsed4 = parsed3.split(",");
    //     Solution += (parsed4[0].equals("APPROVED")) ?  Double.parseDouble(parsed4[1]) : 0;       
    //   }
    
        //split on +
        //remove number before first comma 1001 etc
        //store decline/approve in a hashmap        
        //
        //strip off any \r or \n

        //Improved Solution
    for(int i = 0; i<parsed.length;i++){
        String[] parsed2 = parsed[i].split(",");

        Solution += (parsed2[1].equals("APPROVED") ? Double.parseDouble(parsed2[2]):0);
    }
        
    //nested for loop
    return Solution;
}
}

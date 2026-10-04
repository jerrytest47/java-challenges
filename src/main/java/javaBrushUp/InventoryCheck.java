package main.java.javaBrushUp;

import net.bytebuddy.asm.Advice.Return;

public class InventoryCheck {
//     Apple: expected 20, actual 18
// Orange: expected 10, actual 10
// Banana: expected 12, actual 15

// Return only products where the counts don't match.

public static void main(String[] args) {
    

    String input ="Apple: expected 20, actual 18\r\n" + //
                "Orange: expected 10, actual 10\r\n" + //
                "Banana: expected 12, actual 15";

    System.out.println(inventoryChecker(input));
}

public static StringBuilder inventoryChecker(String input){

    String[] parsed1 = input.split("\\R");
    StringBuilder solution = new StringBuilder();

    for(int i =0; i<parsed1.length;i++){
        
        String parsed2 = parsed1[i].replace(",", "");
        String[]parsed3 = parsed2.split(" ");

        if (!parsed3[2].equals(parsed3[4])) {
            String parsed4 = parsed3[0].replace(":", "");
            solution.append(parsed4+ " ");
        }


    }

    return solution;
}
}

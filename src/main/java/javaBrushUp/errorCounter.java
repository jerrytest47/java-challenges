package main.java.javaBrushUp;

public class errorCounter {
//     Given:
// INFO Login successful
// ERROR Database timeout
// WARN Slow response
// ERROR Payment failed

// Count how many ERROR entries occurred.

public static void main(String[] args) {
    String input = "INFO Login successful\r\n" + //
                "ERROR Database timeout\r\n" + //
                "WARN Slow response\r\n" + //
                "ERROR Payment failed";
                System.out.println(errorCount(input));
}

public static int errorCount(String input){

    String[] parsed1 = input.split("\\r\\n");
    int solution = 0;
    for(int i =0; i<parsed1.length;i++){
    String[] parsed2 = parsed1[i].split(" ");

    if (parsed2[0].equals("ERROR")) {
        solution++;
    }
    }

    return solution;
}
}

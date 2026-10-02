package main.java.javaBrushUp;

public class APIStatusCode {
    public static void main(String[] args) {
        int[] codes = {200, 201, 400, 200, 500, 404};
        System.out.println(codeCount(codes));
    }
    //Return how many were successful (200–299) and how many failed.
    public static String codeCount(int[] input){

        int errors =0;
        int successes =0;

        for(int i =0; i<input.length;i++){
            if (input[i] >299) {
                errors++;
            }
            if (input[i]>199 && input[i]<300) {
                successes++;
            }
        }

        return "Success codes: "+ successes +", Errors: " + errors;
    }
}

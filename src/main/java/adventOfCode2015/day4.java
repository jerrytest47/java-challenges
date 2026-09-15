package main.java.adventOfCode2015;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class day4 {
    
public static void main(String[] args) {
    
}

public static int findLowestNumber(String input) {
    int number = 0;
    String hash = "";
    while (!hash.startsWith("00000")) {
        number++;
        hash = md5(input + number);
    }
    return number;
}

private static String md5(String value) {
    try {
        byte[] digest = MessageDigest.getInstance("MD5")
                .digest(value.getBytes(StandardCharsets.UTF_8));
        StringBuilder hash = new StringBuilder();
        for (byte digit : digest) {
            hash.append(String.format("%02x", digit & 0xff));
        }
        return hash.toString();
    } catch (NoSuchAlgorithmException exception) {
        throw new IllegalStateException("MD5 is unavailable", exception);
    }
}

}

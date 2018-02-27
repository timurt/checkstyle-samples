package kz.tim.samples;

import java.util.Random;

/**
 * Example of the class which does not pass some Checkstyle checks,
 * but violations are suppressed.
 *
 * @author Timur Tibeyev.
 */
public class SuppressionSample {
    private int b = 2;

    /**
     * Generates password of the given lengths.
     *
     * @param length password length
     * @return generated password
     */
    public String genRandomPassword(int length) {
        final String alphabet;
        if (b == 0) {
            alphabet = "0123456789";
        } else if (b == 1) {
            alphabet = "abcdefghijk";
        } else {
            alphabet = "!@#$%^&*()_+=";
        }
        char[] chars = alphabet.toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}

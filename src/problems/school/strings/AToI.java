package problems.school.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AToI {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String source = br.readLine();
            int integer = atoi(source);
            System.out.println(integer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int atoi(final String A) {
        int start = 0;
        while (A.charAt(start) == ' ') {
            start++;
        }

        long integer = 0;
        boolean isNegative = false;
        if (A.charAt(start) == '-' || A.charAt(start) == '+') {
            if (A.charAt(start) == '-') {
                isNegative = true;
            }
            start++;
        }
        for (int i = start; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c >= '0' && c <= '9') {
                integer = integer * 10;
                if (integer > Integer.MAX_VALUE) {
                    if (isNegative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
                integer += c - '0';
            } else {
                break;
            }
        }
        if (integer > Integer.MAX_VALUE) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        if (isNegative) {
            return (int) (0 - integer);
        }
        return (int) integer;
    }
}

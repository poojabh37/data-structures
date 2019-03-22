package difficulty.school.strings;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Pallindrome {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String source = input.next();
                isPalindrome(source);
            }
        }
    }

    private static void isPalindrome(String source) {
//        source = source.toLowerCase();                       //check regardless of case and special char including spaces
//        Pattern regex = Pattern.compile("[^A-Za-z0-9]");
//        source = source.replaceAll(regex.pattern(), "");

        if (source.equals(reverse(source))) {
            System.out.println("YES");
            return;
        }
        System.out.println("No");
    }

}

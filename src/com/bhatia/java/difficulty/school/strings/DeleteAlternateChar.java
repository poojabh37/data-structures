package difficulty.school.strings;

import java.util.Scanner;

public class DeleteAlternateChar {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String s = input.nextLine();

                char[] arr = s.toCharArray();
                char[] neww = new char[s.length() / 2 + 1];
                //for odd number of characters
                int k = 0;
                for (int j = 0; j < s.length(); j = j + 2) {
                    neww[k] = arr[j];
                    k = k + 1;
                }
                System.out.println(new String(neww).trim());
            }
        }

    }


}

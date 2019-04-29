package difficulty.school.numbers;

import java.util.Scanner;


public class Pallindrome {
    //can be done with strings

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            if (num == reverse(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    //can also be done using strings
    private static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);
        return reverse;
    }
}

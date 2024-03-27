package ua.tntu;

import javax.swing.plaf.IconUIResource;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with parentheses: ");
        String input = scanner.nextLine();

        int result = checkBrackets(input);

        if (result == 0) {
            System.out.println("0");
        } else if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println("The first false closing bracket is in position " + result + ".");
        }
    }

    // A method for checking parentheses
    public static int checkBrackets(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return i + 1;
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? 0 : -1;
    }

}

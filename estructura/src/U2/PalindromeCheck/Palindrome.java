package U2.PalindromeCheck;

import U2.ArrayStack.ArrayStack;

public class Palindrome {

    public static boolean isPalindrome(String text) {

        String clean = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        ArrayStack<Character> stack = new ArrayStack<>(clean.length());

        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }

        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

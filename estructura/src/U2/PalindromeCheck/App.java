package U2.PalindromeCheck;

public class App {
    public static void main(String[] args) {
        String text1 = "Anita lava la tina";
        String text2 = "Hola";

        System.out.println(text1 + " ->" + Palindrome.isPalindrome(text1));
        System.out.println(text2 + "-> " + Palindrome.isPalindrome(text2));
    }
}

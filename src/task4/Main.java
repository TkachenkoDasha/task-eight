package task4;

public class Main {

    public static void main(String[] args) {
        String s1 = "А роза упала на лапу Азора";
        StringBuilder s = new StringBuilder(s1);

        if(checkForPalindrome(s)) {
            System.out.println(s + " is the palindrome");
        }

        if (isPalindrome(s1)) {
            System.out.println(s1 + " is the palindrome");
        }
    }

    private static boolean checkForPalindrome(StringBuilder s) {
        String source = s.toString().replaceAll(" ", "").toLowerCase();
        String reverse = new StringBuilder(s).reverse().toString().replaceAll(" ", "").toLowerCase();
        return source.equals(reverse);
    }

    private static boolean isPalindrome(String s) {
        String clean = s.replaceAll(" ", "").toLowerCase();

        for (int j = clean.length() - 1, i = 0; j >= 0; j--, i++) {
            char first = clean.charAt(i);
            char last = clean.charAt(j);
            if (last != first) {
                return false;
            }
        }
        return true;
    }

}

package task2;

public class Main {

    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("Dasha");

        System.out.println(line.reverse());

        String line1 = "Dasha";
        char[] chars = line1.toCharArray();

        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(String.valueOf(chars[i]));
        }

        System.out.println(result);

    }
}

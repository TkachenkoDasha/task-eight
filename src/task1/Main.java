package task1;

public class Main {

    public static void main(String[] args) {
        String name = "Tkachenko Dariia Vadimovna";
        String[] splitName = name.split(" ");

        System.out.print(splitName[0] + " ");

        for (int i = 1; i < splitName.length; i++) {
            System.out.print(splitName[i].charAt(0) + "." + " ");
        }
    }
}

package task3;

public class Main {

    public static void main(String[] args) {
        String fullString = "mama";
        String reqString = "ma";

        System.out.println((fullString + "\0").split(reqString).length - 1);
    }
}

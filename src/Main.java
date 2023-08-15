import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world! what's your name, dude? ");
        String userName = scanner.nextLine();
        System.out.println("we didn't add Date, " + userName);
    }
}

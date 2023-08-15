import java.util.Scanner;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world! what's your name, dude? ");
        String userName = scanner.nextLine();
        System.out.println("we didn't add Date, " + userName);
        System.out.println("Hello world!");

        System.out.println("we didn't add Date ");


        Date date=new Date();
         System.out.println("we add new Date!");

    }
}

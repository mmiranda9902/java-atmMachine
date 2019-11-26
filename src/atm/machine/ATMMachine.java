package atm.machine;

import java.util.Scanner;

public class ATMMachine {

    private static final String USERNAME = "user";
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean logIn = false;
        System.out.println("Please enter your username.");
        String user = kb.nextLine();
        System.out.println("Please enter your pin.");
        int password = kb.nextInt();
        

}

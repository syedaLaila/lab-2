import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] userDetails = new String[5][2];

        for (int i = 0; i < userDetails.length; i++) {
            System.out.println("Enter email and password for user " + (i + 1));
            userDetails[i][0] = input.nextLine();
            userDetails[i][1] = input.nextLine();
        }

        System.out.println("Enter email and password to login");
        String email = input.nextLine();
        String password = input.nextLine();

        for (int i = 0; i < userDetails.length; i++) {
            if (userDetails[i][0].equals(email) && userDetails[i][1].equals(password)) {
                System.out.println("Welcome!");
                return;
            }
        }

        System.out.println("Invalid email or password");
    }
}
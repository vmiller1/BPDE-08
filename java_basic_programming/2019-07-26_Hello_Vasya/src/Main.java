import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please enter you name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello World!");
        System.out.println("Hello, " + name);


        int age = 0;
        boolean flag = false;
        do {
            try {
                System.out.print("Please enter your age:");
                age = Integer.parseInt(scanner.nextLine());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("You entered wrong age. Please try again.");
                //System.out.println(Arrays.toString(e.getStackTrace()));
            }
        } while (!flag);

        System.out.println("Really? You are " + age + "?");
    }
}

import java.util.Scanner;
public class MyName {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.println("Your name is: " + name);

        input.close();
    }
}

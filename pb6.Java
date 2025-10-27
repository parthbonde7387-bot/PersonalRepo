import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // MAD LIBS GAMES

        Scanner scanner = new Scanner(System.in);

        String abjective1;
        String noun1;
        String abjective2;
        String verb1;
        String abjective3;

        System.out.println("Enter an abjective (discription): ");
        abjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person)");
        noun1 = scanner.nextLine();
        System.out.println("Enter an abjective (discription): ");
        abjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an abjective (discription): ");
        abjective3 = scanner.nextLine();

        System.out.println("\n Today I went te a " + abjective1 + " zoo" );
        System.out.println("In an exhibit, I saw a "+ noun1 + ".");
        System.out.println(noun1 + " was " + abjective2 + " and " + verb1 + " ! ");
        System.out.println("I was a " + abjective3 + "!");

        scanner.close();
    }
}
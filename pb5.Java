import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Calculate area of rectangel

        double width = 0;
        double heigth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the heigth: ");
        heigth = scanner.nextDouble();

        area = width * heigth ;

        System.out.println("The area is : " + area + " cm");

        scanner.close();
    }
}
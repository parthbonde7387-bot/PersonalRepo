import java.util.Scanner ;

class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : " );
        String name =scanner.nextLine();

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("What is your CGPA : ");
        Double CGPA = scanner.nextDouble();

        System.out.println("Are you a student : ( true/false)");
        Boolean isStudent = scanner.nextBoolean();

             System.out.println("Hello " + name);
             System.out.println("You are" + " " + age + " " +"year old");
             System.out.println("Your CGPA is : " + CGPA );

             if (isStudent) {
                 System.out.println("You are enrolled as a student");
             }
             else {
                 System.out.println("You are NOT enrolled as a student");
             }


        scanner.close();

    }
}
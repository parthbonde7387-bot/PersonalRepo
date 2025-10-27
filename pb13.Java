
public class Main {
    public static void main(String[] args) {

        //printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Parth";
        char firstLetter = 'P';
        int age = 19;
        double height = 192.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with %c\n", firstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your height is %.1f\n",height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

    }
}

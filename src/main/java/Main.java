import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final InputStream inputStream = System.in;
        final Scanner scanner = new Scanner(inputStream);

        System.out.println("Enter your birth date as following: \"01.02.2005\" and press \"Enter\"");

        final String userBirthDate = scanner.nextLine();

        System.out.println("userBirthDate: " + userBirthDate);


        final AgeCalculator ageCalculator = new AgeCalculator();
        ageCalculator.getUserAge(userBirthDate);

        final BirhdayScheduler birhdayScheduler = new BirhdayScheduler();
        birhdayScheduler.getBirthday(userBirthDate);
    }
}

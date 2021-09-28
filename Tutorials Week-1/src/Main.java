import java.util.Scanner;
import java.time.LocalDate;
public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month you were born: ");
        int monthBorn = input.nextInt();
        System.out.println("Enter the day you were born: ");
        int dayBorn = input.nextInt();
        System.out.println("Enter the year you were born: ");
        int yearBorn = input.nextInt();
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }
}


import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        String tToday = today.format(formatter);
        System.out.println("Today's date is: " + tToday);

        //System.out.println("Put the current date? (Enter as a number: Monday = 17)");
        //int dMonth = scanner.nextInt();
        System.out.println("When was the last time there was a full moon? [Day] 1-31 ");
        int myDay = scanner.nextInt();
        System.out.println("When was the last time there was a full moon? [Month] 1-12 ");
        int myMonth = scanner.nextInt();
       // int tMonth = today.getMonthValue();


        LocalDate fMoon = LocalDate.of(today.getYear(),myMonth, myDay);

        if (fMoon.isBefore(today)) {
            fMoon = fMoon.plusDays(1);
        }
        if (fMoon.isBefore(today)){
            fMoon = fMoon.plusMonths(1);
        }

       //long nfMoon = today.until(fMoon, ChronoUnit.MONTHS);


        long ufMoon = today.until(fMoon, ChronoUnit.DAYS);
        ufMoon = Math.abs(ufMoon);


        if (myDay == today.getDayOfMonth()) {
            System.out.println("Today is a full moon!");
        } else {
            System.out.println("Next full moon will be on: " + fMoon);
            System.out.println("There are " + ufMoon + " days until full moon!");
        }
    }
}
package java_hw_10.hw_task_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        TimeHandler timeHandler = new TimeHandler();

        System.out.println("----------Task 1----------");

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        System.out.println("----------Task 2----------");

        LocalDateTime futureDate = timeHandler.calculateFutureDateTime(LocalDateTime.of(2023, 10, 25, 14, 30), 3, 5);
        System.out.println(futureDate);

        System.out.println("----------Task 3----------");

        boolean isWeekendResult = timeHandler.isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0));
        System.out.println(isWeekendResult);

        boolean isWeekendResult1 = timeHandler.isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0));
        System.out.println(isWeekendResult1);

        System.out.println("----------Task 4----------");

        String formattedResult = timeHandler.formatDateTime(LocalDateTime.of(2023, 10, 25, 14, 30), "dd-MM-yyyy HH:mm");
        System.out.println(formattedResult);

        System.out.println("----------Task 5----------");

        Duration differenceResult = timeHandler.calculateDifference(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                LocalDateTime.of(2023, 10, 28, 16, 45)
        );
        System.out.println("Difference is: " + differenceResult.toDays() + " days, " + differenceResult.toHoursPart() + " hours, " + differenceResult.toMinutesPart() + " minutes");
    }
}

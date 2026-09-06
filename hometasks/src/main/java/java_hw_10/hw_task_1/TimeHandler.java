package java_hw_10.hw_task_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeHandler {
    public LocalDateTime calculateFutureDateTime(LocalDateTime date, int days, int hours) {
        date = date.plusDays(days);
        date = date.plusHours(hours);
        return date;
    }

    public boolean isWeekend(LocalDateTime dateTime) {
        if(dateTime.getDayOfWeek().ordinal() == 5 || dateTime.getDayOfWeek().ordinal() == 6) {
            return true;
        }
        return false;
    }

    public String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formatedDate = dateTime.format(formatter);
        return formatedDate;
    }

    public static Duration calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return duration;
    }
}

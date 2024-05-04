package util_classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeUtilsJava {
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static String getCurrentDate() {
        return LocalDate.now().format(formatter);
    }
}




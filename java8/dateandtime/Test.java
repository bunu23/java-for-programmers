
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // LocalDate: Represents a date without time (yyyy-MM-dd)
        LocalDate today = LocalDate.now(); // Current date
        System.out.println("Today's date: " + today);

        LocalDate customDate = LocalDate.of(1993, 3, 20); // Custom date (March 20, 1993)
        System.out.println("Custom date: " + customDate);

        int dayOfMonth = today.getDayOfMonth(); // Get day of the month
        int year = today.getYear(); // Get year
        Month month = today.getMonth(); // Get the month as an enum
        int monthValue = today.getMonthValue(); // Get the numeric value of the month

        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month + " (Value: " + monthValue + ")");

        // Manipulating LocalDate
        LocalDate pastDate = today.minusDays(3); // Subtract 3 days from the current date
        System.out.println("3 days ago: " + pastDate);

        if (today.isAfter(pastDate)) {
            System.out.println("Today is after pastDate.");
        }

        // LocalTime: Represents a time without date (hh:mm:ss)
        LocalTime currentTime = LocalTime.now(); // Current time
        System.out.println("Current time: " + currentTime);

        int hour = currentTime.getHour(); // Get the current hour
        System.out.println("Current hour: " + hour);

        LocalTime customTime = LocalTime.of(13, 30, 30); // Custom time (13:30:30)
        System.out.println("Custom time: " + customTime);

        String timeInString = "12:30:45";
        LocalTime parsedTime = LocalTime.parse(timeInString); // Parsing a string to LocalTime
        System.out.println("Parsed time: " + parsedTime);

        // Time manipulation
        LocalTime oneHourBefore = currentTime.minusHours(1); // Subtract 1 hour
        System.out.println("1 hour before current time: " + oneHourBefore);

        if (currentTime.isAfter(oneHourBefore)) {
            System.out.println("Current time is after one hour before.");
        }

        // LocalDateTime: Combines date and time (yyyy-MM-ddTHH:mm:ss)
        LocalDateTime currentDateTime = LocalDateTime.now(); // Current date and time
        System.out.println("Current date and time: " + currentDateTime);

        LocalDateTime customDateTime = LocalDateTime.of(1993, 3, 20, 12, 45, 0); // Custom date and time
        System.out.println("Custom date and time: " + customDateTime);

        // ZonedDateTime: Represents date and time with timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Current date, time, and timezone
        System.out.println("Current ZonedDateTime: " + zonedDateTime);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds(); // Get all available zone IDs
        System.out.println("Available time zones:");
        availableZoneIds.stream().limit(5).forEach(System.out::println); // Print first 5 available zones

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York")); // New York time
        System.out.println("Current time in New York: " + newYorkTime);

        // Instant: A moment on the timeline in UTC (useful for timestamps)
        Instant nowInstant = Instant.now(); // Current timestamp in UTC
        System.out.println("Current instant (UTC): " + nowInstant);

        Instant oneHourAgo = nowInstant.minus(1, ChronoUnit.HOURS); // Subtract 1 hour from instant
        System.out.println("Instant 1 hour ago: " + oneHourAgo);

        // Period: Represents date-based amount of time (years, months, days)
        LocalDate birthDate = LocalDate.of(1993, 3, 20);
        Period age = Period.between(birthDate, today); // Calculate period between two dates
        System.out.println(
                "Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

        // Duration: Represents time-based amount of time (hours, minutes, seconds)
        Duration timeDifference = Duration.between(oneHourBefore, currentTime); // Difference between two LocalTimes
        System.out.println("Duration between one hour before and now: " + timeDifference.toMinutes() + " minutes");

        // Formatting Date and Time
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Custom date pattern
        String formattedDate = today.format(dateFormatter);
        System.out.println("Formatted date: " + formattedDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Custom time pattern
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted time: " + formattedTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Date and time
                                                                                                  // pattern
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CurrentTimeFromEpoch {
    public static void main(String[] args) {
        // Get the current time in milliseconds since Unix epoch
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(String.valueOf(currentTimeMillis));

        System.out.println(String.format("%,d", currentTimeMillis));
        float currentTimeMillisF = currentTimeMillis;
        System.out.println(String.format("%,5f", currentTimeMillisF));

        // Convert milliseconds to Instant
        Instant instant = Instant.ofEpochMilli(currentTimeMillis);

        // Convert Instant to LocalDateTime
        LocalDateTime currentTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println("Current Time: " + currentTime);

        float ffloat = 9.9f;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.BYTES);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

    }
}

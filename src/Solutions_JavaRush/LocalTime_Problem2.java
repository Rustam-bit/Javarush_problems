package Solutions_JavaRush;

import java.time.LocalTime;

public class LocalTime_Problem2 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        LocalTime time = base.plusMinutes(48);
        return time.plusHours(4);
    }
}

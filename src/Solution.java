

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Solution {

    public static void main(String[] args) {
        ZoneId timezone = ZoneId.of("Asia/Dushanbe");
        LocalDate date = LocalDate.now(timezone);
        System.out.println("now day is " + date);
    }
}

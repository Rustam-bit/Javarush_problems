

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Solution {

    public static void main(String[] args) {
        ZoneId t = ZoneId.of("Asia/Dushanbe");
        LocalDate date = LocalDate.now(t);
        System.out.println("now day is " + date);
    }
}

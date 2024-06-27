package Lection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTime_1 {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.YYYYг. Hч.mмин");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}

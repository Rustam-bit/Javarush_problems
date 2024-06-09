package Lection;

import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();//лишние секунды после указания времени hout::minute::second......
        System.out.println(time);
        LocalTime corect_time = LocalTime.of(1,2,3);
        System.out.println(corect_time);
        System.out.println(LocalTime.ofSecondOfDay(1000));//функция для перевода количества секунд в час:мин:сек
        //есть еще функции для добавления и разности времени(+-сек, мин, час)
        System.out.println(LocalTime.now().plusHours(1));
        System.out.println(LocalTime.now().minusMinutes(10));
        System.out.println(LocalTime.now().plusSeconds(300));
    }
}

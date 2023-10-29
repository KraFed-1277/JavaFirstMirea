package done.pr_11;

import java.util.Date;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Date date = new Date();
        Date sysTime = new Date(System.currentTimeMillis());

        int year, month, day, hour, minute, second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        year = sc.nextInt();
        System.out.print("Month: ");
        month = sc.nextInt();
        System.out.print("Day: " );
        day = sc.nextInt();
        System.out.print("Hour: ");
        hour = sc.nextInt();
        System.out.print("Minute: ");
        minute = sc.nextInt();
        System.out.print("Second: ");
        second = sc.nextInt();

        Date userDate = new Date();
        userDate.setYear(year);
        userDate.setMonth(month);
        userDate.setDate(day);
        userDate.setHours(hour);
        userDate.setMinutes(minute);
        userDate.setSeconds(second);


        if (userDate.compareTo(sysTime) > 0) {
            System.out.println("Введенная дата раньше сегодняшнего дня");
        } else if (date.compareTo(sysTime) < 0) {
            System.out.println("Введенная дата позже сегодняшнего дня");
        } else {
            System.out.println("Введенная дата совпадает с сегодняшним днем");
        }
    }
}
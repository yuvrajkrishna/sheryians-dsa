import java.util.Arrays;

public class leetcode {
    static void main() {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        String [] dateone  =  date1.split("-");
        String [] datetwo = date2.split("-");
        int first = findDay(dateone);
        int second = findDay(datetwo);
        System.out.println(Math.abs(first-second));
    }
    static int  findDay(String date[]) {
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        year = Math.abs(year-1900)*365;
        month = Math.abs(month-1)*30;
        day = Math.abs(day-0);
        int total = year+month+day;
        return total;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calendar {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Dates> calendar = new ArrayList<>();

    public void makeCalendar() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++)
                for (int x = 1000; x < 1800; x += 100) {
                    calendar.add(new Dates(j, i, x));
                }
            System.out.println();
        }
    }

    public void printCalendar() {
        for (int i = 0; i < calendar.size(); i++)
            System.out.println(calendar.get(i));
    }

    public int scanDate() {
        System.out.println("Hvilken dato");
        int date = scan.nextInt();
        return date;
    }

    public int scanMonth() {
        System.out.println("Hvilken måned?");
        int month = scan.nextInt();
        return month;
    }

    public void printRequestedCalendarDates() {
        int month = scanMonth();
        int date = scanDate();
        //(month * 31 * 8) - (31 * 8) + (date * 8) - 8;
        int arrayPositionForRequestedDates = (month * 31 * 8) - (31 * 8) + (date * 8) - 8;
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 32; i++) {
            System.out.println(calendar.get(i));
        }
    }
    public void setAppointment(){
        calendar.get(1).setCustomerAppointment("Hamsa","8435r");
    }
}

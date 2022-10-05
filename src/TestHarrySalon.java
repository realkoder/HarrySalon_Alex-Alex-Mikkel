import java.util.Arrays;

public class TestHarrySalon {
    Calendar calendar = new Calendar();
    public void run(){
        calendar.makeCalendar();

        calendar.setAppointment();
        calendar.printCalendar();
        calendar.printRequestedCalendarDates();

    }

    public static void main(String[] args){
        new TestHarrySalon().run();
    }
}

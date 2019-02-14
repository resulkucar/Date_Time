import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class dateTime {

    public static void main(String args[]) {
        SimpleDateFormat dateTime= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        dateTime.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EST")));
        System.out.println("\nDate and time now: "+dateTime.format(System.currentTimeMillis()));
    }
}
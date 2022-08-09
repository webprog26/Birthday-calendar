import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AgeCalculator {

    public int getUserAge(final String userBirthDate) {
        final Calendar calendarNow = Calendar.getInstance();
        final long currentTimeInMillis = System.currentTimeMillis();
        calendarNow.setTimeInMillis(currentTimeInMillis);

        final Calendar calendarPast = Calendar.getInstance();
        calendarPast.set(Calendar.YEAR, 1990);

        System.out.println("It has been "
                +  (calendarNow.get(Calendar.YEAR) - calendarPast.get(Calendar.YEAR)) + " years since 1990. Time flies.");

        return 0;
    }
}

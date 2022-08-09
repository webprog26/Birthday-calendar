import java.text.SimpleDateFormat;
import java.util.*;

public class BirhdayScheduler {

    public String getBirthday(final String userBirthDate) {
        final Calendar calendarNow = Calendar.getInstance();
        final long currentTimeInMillis = System.currentTimeMillis();
        calendarNow.setTimeInMillis(currentTimeInMillis);


        final Date date = calendarNow.getTime();


        final String DATE_FORMAT_PATTERN = "EEE";

        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN, Locale.US);
        final String shortDayOfWeek = simpleDateFormat.format(date);

        final String fullDayOfWeek = getFullDayOfWeek(shortDayOfWeek);

        System.out.println("Wow! It is " + fullDayOfWeek);

        return "";
    }

    private String getFullDayOfWeek(final String shortDayOfWeek) {
        final String MON = "Mon";
        final String TUE = "Tue";
        final String WED = "Wed";
        final String THU = "Thu";


        final Map<String, String> daysOfWeekMap = new HashMap<>();
        daysOfWeekMap.put(MON, "Monday");
        daysOfWeekMap.put(TUE, "Tuesday");
        daysOfWeekMap.put(WED, "Wednesday");
        daysOfWeekMap.put(THU, "Thursday");

        final String fullDayOfWeek = daysOfWeekMap.get(shortDayOfWeek);
        return fullDayOfWeek;
    }
}
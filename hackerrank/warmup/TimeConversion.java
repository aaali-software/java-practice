package hackerrank.warmup;

public class TimeConversion {

    public static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));

        if (period.equals("AM")) {
            hour = hour == 12 ? 0 : hour; // Convert 12 AM to 00, keep other hours unchanged
        } else {
            hour = hour == 12 ? 12 : hour + 12; // Convert PM hours to 24-hour format, keep 12 PM as is
        }

        // Format hour to two digits and append the rest of the time string (excluding
        // the period)
        return String.format("%02d%s", hour, s.substring(2, 8));
    }

    public static void main(String[] args) {
        String time = "07:05:45PM";
        String convertedTime = timeConversion(time);
        System.out.println(convertedTime);
    }

}

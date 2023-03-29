import java.util.Scanner;

class TimeZone
{
public static void main(String Strings[])
{
Scanner time = new Scanner(System.in);
System.out.println("Input the time zone offset to GMT : ");
long timeZoneChange=time.nextInt();
long totalMilliseconds = System.currentTimeMillis();

long totalSeconds = totalMilliseconds / 1000;
long currentSecond = totalSeconds % 60;
long totalMinutes = totalSeconds/60;
long currentMinute =totalMinutes % 60;
long totalHours = totalMinutes / 60;
long currentHour = ((totalHours + timeZoneChange) % 24);
System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
}
}



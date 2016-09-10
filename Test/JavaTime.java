import java.time.*;
import java.time.format.*;

public class JavaTime {
	
public static void main(String[] args) throws Exception{

	LocalDate date = LocalDate.now();
	LocalDate today = LocalDate.now();
	LocalTime now = LocalTime.now();
	LocalDateTime todaynow = LocalDateTime.now();

	System.out.println("Now is " + now);
	System.out.println("Created LDT : " + todaynow);


	System.out.println("LocalDate is " + date);
	System.out.println("Adding Two Days, Three Months :" + date.plusDays(2).plusMonths(3));

	System.out.println("======================================================");

	System.out.println("Another date is " +today);
	System.out.println("Taking 5 days, Thirteen months and 6 Years out : " +today.minusDays(5).minusMonths(13).minusYears(6));


	// DateTimeFormatter format = new DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);		//WRONG
	// System.out.println("Formatted DateTime : " + format(todaynow));		//WRONG

	Period p = Period.ofMonths(2);
	Period p2 = Period.of(10,4,2);

	LocalDate ldate = LocalDate.now();
	LocalDate ldate2 = LocalDate.now();
	System.out.println("LocalDate : " + ldate);
	System.out.println("LocalDate after adding period of 2 Months : " + ldate.plus(p));
	System.out.println("LocalDate : " + ldate2);
	System.out.println("LocalDate after Plus(10,4,2) is : " + ldate.plus(p2));

	// LocalTime ltime = LocalTime.of(12,30,00,000);
	// System.out.println(ltime + "  LOCAL TIME 12,30 ");



	System.out.println("============ISO FORMATS=========================");
	System.out.println(todaynow.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	System.out.println(today.format(DateTimeFormatter.ISO_LOCAL_DATE));
	System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_TIME));
	System.out.println("=================================================");


	System.out.println("===============  FORMAT SHORT : =====================");
	DateTimeFormatter shortdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	System.out.println("SHORT DATE : " + shortdate.format(todaynow));
	System.out.println("SHORT TIME : " + DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(now));
	System.out.println("SHORT DATE TIME : " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(todaynow));

	System.out.println("===============  FORMAT MEDIUM : =====================");

	DateTimeFormatter shortdate2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	System.out.println("SHORT DATE : " + shortdate2.format(todaynow));
	System.out.println("SHORT TIME : " + DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(now));
	System.out.println("SHORT DATE TIME : " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(todaynow));

	System.out.println("=======================================================");


	LocalDate ltoday = LocalDate.now();
	System.out.println(ltoday.format(DateTimeFormatter.ofPattern("MM/dd/YY")));

	}

}
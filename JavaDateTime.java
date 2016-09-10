import java.time.*;

class JavaDateTime {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println("Current Date and Time :");
		System.out.println(ld + "\n" +lt +"\n" +ldt );

		System.out.println("Specific date and time:");

		LocalDate ldnow = LocalDate.of(2015,Month.SEPTEMBER,2);
		LocalTime ltnow = LocalTime.of(9,30,0,0);

		System.out.println(ldnow + " " +ltnow);
	}
}
import java.time.*;

public class JavaTime{

	public static void main(String[] args) {

		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());

		for (int i=0;i<10_000 ;i++ ) {
			if((i%500)==0)
				System.out.println(LocalTime.now());
		} //Prints Time for a number of times

		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(18);
		System.out.println("Added 18 days");
		System.out.println(date);
	}
}
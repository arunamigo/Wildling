import java.time.*;

public class JavaTime {
	
public static void main(String[] args) {

	LocalDate date = LocalDate.now();
	System.out.println("Date: " + date);

	LocalDate today = LocalDate.now();

	System.out.println("Date equals? :" + date.equals(today));
	// System.out.println("Era : " + date.getEra());

	System.out.println(date.getMonth() +" "+ date.getDayOfMonth());
	
	}

}
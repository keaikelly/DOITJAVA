package hiding;
import java.util.Calendar;
import java.util.Date;
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 07, 2023);
		System.out.println(date2.isValid());

	}

}

package A13NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class LongFormat {

	public static void main(String[] args) {
		long l = 56804;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(l));
		NumberFormat uk = NumberFormat.getInstance(Locale.UK);
		System.out.println(uk.format(l));
	}

}

package jayray.net.common.nullchecker;

import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author j.ray
 */
public class NullChecker {

	public static boolean isNullish(String value) {
		boolean result = false;
		if ((value == null) || (value.trim().contentEquals(""))) {
			result = true;
		}
		return result;
	}

	public static boolean isNotNullish(String value) {
		return (!isNullish(value));
	}

	public static boolean isNullish(int value) {
		return value==0;
	}

	public static boolean isNotNullish(int value) {
		return (!isNullish(value));
	}

	public static boolean isNullish(GregorianCalendar value) {
		boolean result = false;
		if ((value == null)) {
			result = true;
		}
		return result;
	}

	public static boolean isNotNullish(GregorianCalendar value) {
		return (!isNullish(value));
	}

	public static boolean isNullish(Collection<?> value) {
		boolean result = false;
		if ((value == null) || (value.size() == 0)) {
			result = true;
		}
		return result;
	}

	public static boolean isNotNullish(Collection<?> value) {
		return (!isNullish(value));
	}

	public static boolean isNotNullish(Date value) {
		return (!isNullish(value));
	}

	public static boolean isNullish(Date value) {
		return (value == null);
	}
}

package jayray.net.common.nullchecker;

import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: jasonray
 * Date: 3/21/13
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class NullCheckerDateTest {
    @Test
    public void checkIsNullOnPoplatedDate() {
        GregorianCalendar value = new GregorianCalendar(2000, 1, 1);
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnPopulatedDate() {
        GregorianCalendar value = new GregorianCalendar(2000, 1, 1);
        assertEquals(true, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOnNullDate() {
        GregorianCalendar value = null;
        assertEquals(true, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnNullDate() {
        GregorianCalendar value = null;
        assertEquals(false, NullChecker.isNotNullish(value));
    }
}

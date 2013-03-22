package jayray.net.common.nullchecker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: jasonray
 * Date: 3/21/13
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class NullCheckerIntegerTest {
    @Test
    public void checkIsNullOnNull() {
        Integer value = null;
        assertEquals(true, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnNull() {
        Integer value = null;
        assertEquals(false, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNotNullOn0() {
        Integer value = 0;
        assertEquals(false, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOn1() {
        Integer value = 1;
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOn1() {
        Integer value = 1;
        assertEquals(true, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOnNegative1() {
        Integer value = -1;
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnNegative1() {
        Integer value = -1;
        assertEquals(true, NullChecker.isNotNullish(value));
    }
}

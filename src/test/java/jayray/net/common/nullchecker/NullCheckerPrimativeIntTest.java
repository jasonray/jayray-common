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
public class NullCheckerPrimativeIntTest {
    @Test
    public void checkIsNullOn0() {
        int value = 0;
        assertEquals(true, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOn0() {
        int value = 0;
        assertEquals(false, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOn1() {
        int value = 1;
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOn1() {
        int value = 1;
        assertEquals(true, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOnNegative1() {
        int value = -1;
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnNegative1() {
        int value = -1;
        assertEquals(true, NullChecker.isNotNullish(value));
    }
}

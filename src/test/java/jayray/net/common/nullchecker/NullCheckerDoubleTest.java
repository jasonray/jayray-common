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
public class NullCheckerDoubleTest {
    @Test
    public void checkIsNullOnNull() {
        Double value = null;
        assertEquals(true, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnNull() {
        Double value = null;
        assertEquals(false, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNotNullOn0() {
        Double value = new Double(0);
        assertEquals(false, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOn1() {
        Double value = new Double(1);
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOn1() {
        Double value = new Double(1);
        assertEquals(true, NullChecker.isNotNullish(value));
    }

    @Test
    public void checkIsNullOnNegative1() {
        Double value = new Double(-11);
        assertEquals(false, NullChecker.isNullish(value));
    }

    @Test
    public void checkIsNotNullOnNegative1() {
        Double value = new Double(-11);
        assertEquals(true, NullChecker.isNotNullish(value));
    }
}

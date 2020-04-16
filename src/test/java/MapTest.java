
import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapTest{
    Map map;

    @Before
    public void setUp() throws Exception {
        map = new Map();
    }

    @After
    public void tearDown() throws Exception {
        map = null;
    }

    @Test
    public void setMapSize_TooSmall() {
        boolean result = map.setMapSize(4,4,6);
        assertFalse(result);
    }

    @Test
    public void setMapSize_TooBig() {
        boolean result = map.setMapSize(60,60,8);
        assertFalse(result);
    }
    @Test
    public void setMapSize_UnequalParameters() {
        boolean result = map.setMapSize(40,30,8);
        assertTrue(result);
    }
    @Test
    public void setMapSize() {
        boolean result = map.setMapSize(30,30,6);
        assertTrue(result);
    }

    @Test
    public void generate() {
    }

    @Test
    public void getTileType() {
    }
}

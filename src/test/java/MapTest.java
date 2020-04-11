
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
        boolean result = map.setMapSize(3,4,6);
        assertFalse(result);
    }

    @Test
    public void setMapSize_TooBig() {
        boolean result = map.setMapSize(60,50,8);
        assertFalse(result);
    }
    @Test
    public void setMapSize() {
        boolean result = map.setMapSize(30,10,6);
        assertTrue(result);
    }

    @Test
    public void generate() {
    }

    @Test
    public void getTileType() {
    }
}

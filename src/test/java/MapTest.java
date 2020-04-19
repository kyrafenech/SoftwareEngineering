
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
        boolean result = map.setMapSize(4,6);
        assertFalse(result);
    }

    @Test
    public void setMapSize_TooBig() {
        boolean result = map.setMapSize(60,8);
        assertFalse(result);
    }
    @Test
    public void setMapSize_UnequalParameters() {
        boolean result = map.setMapSize(40,8);
        assertTrue(result);
    }
    @Test
    public void setMapSize() {
        boolean result = map.setMapSize(30,6);
        assertTrue(result);
    }

    @Test
    public void generate() { //testing that map generation creates the required amount of tiles
        map.setMapSize(30,6);
        Tile[][] grid = map.generate();
        assertEquals(30, grid.length);
    }

    @Test
    public void getTileType() {
    }
}

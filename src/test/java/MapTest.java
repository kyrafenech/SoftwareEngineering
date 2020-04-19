
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapTest{
    Map map;

    @Before
    public void setUp() throws Exception {
        map = new Map(25);
    }

    @After
    public void tearDown() throws Exception {
        map = null;
    }

    @Test
    public void generate() { //testing that map generation creates the required amount of tiles

    }

    @Test
    public void setGrass(){

    }

    @Test
    public void setWater(){

    }

    @Test
    public void getSize(){
        assertEquals(25, map.getSize());
    }

    @Test
    public void getTile() {
    }

    @Test
    public void uncoverTile(){

    }
}

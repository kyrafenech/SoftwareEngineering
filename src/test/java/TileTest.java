import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TileTest {

    Tile tile;

    @Before
    public void setUp() throws Exception {
        this.tile = new Tile(TileType.GRASS);
    }

    @After
    public void tearDown() throws Exception {
        this.tile = null;
    }

    @Test
    public void getType(){
        TileType type = tile.getType();
        assertEquals(TileType.GRASS, type);
    }

    @Test
    public void uncoverTile(){

    }

    @Test
    public void setUncovered(){

    }

    @Test
    public void getHtml(){

    }

}

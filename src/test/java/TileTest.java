import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TileTest {

    Tile tile;
    TileType type = TileType.randomTileType();

    @Before
    public void setUp() throws Exception {
        this.tile = new Tile(this.type);
    }

    @After
    public void tearDown() throws Exception {
        this.tile = null;
    }

    @Test
    public void testGetType(){
        TileType type = tile.getType();
        assertEquals(this.type, type);
    }

    @Test
    public void testUncoverTile(){

    }

}

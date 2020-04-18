import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;
    Tile[][] grid;
Map map;

    @Before
    public void setUp() {
        map = Map.getMap();
        map.setMapSize(20, 6);
        grid = map.generate();
        player = new Player();

    }

    @After
    public void tearDown()
    {
        player = null;
        map.grid=null;
        map.size = 0;
    }

    @Test
    public void moveUp() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('U', 10);
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x, new_x);
        assertEquals(y + 1, new_y);

    }

    @Test
    public void moveDown() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('D', 10);
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x, new_x);
        assertEquals(y - 1, new_y);
    }

    @Test
    public void moveRight() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('R', 10);
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x + 1, new_x);
        assertEquals(y, new_y);

    }

    @Test
    public void moveLeft() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('L', 10);
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x - 1, new_x);
        assertEquals(y, new_y);
    }

    @Test
    public void testSize(){
        System.out.println(map.getSize());

    }
    @Test
    public void setInitialPositionTest() {
        Position start = player.setInitialPosition(map.getSize());
        int x =start.getX();
        int y = start.getY();
        char result = grid[x][y].tileType();
        assertEquals('G', result);

    }
    @Test
    public void setInitialPositionTest2() {
        int x =player.initial.getX();
        int y = player.initial.getY();
        char result = grid[x][y].tileType();
        assertEquals('G', result);

    }
}
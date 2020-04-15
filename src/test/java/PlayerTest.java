import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @After
    public void tearDown() {
        player = null;
    }

    @Test
    public void moveUp() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('U');
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x, new_x);
        assertEquals(y + 1, new_y);

    }

    @Test
    public void moveDown() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('D');
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x, new_x);
        assertEquals(y - 1, new_y);
    }

    @Test
    public void moveRight() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('R');
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x + 1, new_x);
        assertEquals(y, new_y);

    }

    @Test
    public void moveLeft() {

        int x = player.current.getX();
        int y = player.current.getY();
        player.move('L');
        int new_x = player.current.getX();
        int new_y = player.current.getY();

        assertEquals(x -1, new_x);
        assertEquals(y, new_y);
    }
}
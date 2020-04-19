import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TileType {
        GRASS("#67E240"),
        WATER("#2FA6F1"),
        TREASURE("#FFFB40");

        private String hexCode;

        TileType(String fffb40) {
                this.hexCode = fffb40;
        }

        //returns the corresponding hexadecimal colour number
        public String getHexCode(){
                return this.hexCode;
        }

        private static final List<TileType> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        //get random tile type
        public static TileType randomTileType() {
                return VALUES.get(RANDOM.nextInt(SIZE));
        }

}
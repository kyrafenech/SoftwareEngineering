public enum TileType {
        GRASS("67E240"),
        WATER("#2FA6F1"),
        TREASURE("FFFB40");

        private String hexCode;

        TileType(String fffb40) {
                this.hexCode = fffb40;
        }

        public String getHexCode(){
                return this.hexCode;
        }

}
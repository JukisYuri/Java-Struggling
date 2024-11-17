package EX20;

public class CD {
        private int id, songCD;
        private String titleCD, singer;
        private double saleSong;
        public CD(int id, int songCD, String titleCD, String singer, double saleSong) {
            super();
            this.id = id;
            this.songCD = songCD;
            this.titleCD = titleCD;
            this.singer = singer;
            this.saleSong = saleSong;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getSongCD() {
            return songCD;
        }
        public void setSongCD(int songCD) {
            this.songCD = songCD;
        }
        public String getTitleCD() {
            return titleCD;
        }
        public void setTitleCD(String titleCD) {
            this.titleCD = titleCD;
        }
        public String getSinger() {
            return singer;
        }
        public void setSinger(String singer) {
            this.singer = singer;
        }
        public double getSaleSong() {
            return saleSong;
        }
        public void setSaleSong(double saleSong) {
            this.saleSong = saleSong;
        }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", songCD=" + songCD +
                ", titleCD='" + titleCD + '\'' +
                ", singer='" + singer + '\'' +
                ", saleSong=" + saleSong +
                '}';
    }
}

package DataStructure.Lab10.Task2;

public class ChuongSach {
    private String tieuDe;
    private int soTrang;

    public ChuongSach(String tieuDe, int soTrang) {
        this.tieuDe = tieuDe;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "ChuongSach{" +
                "tieuDe='" + tieuDe + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}

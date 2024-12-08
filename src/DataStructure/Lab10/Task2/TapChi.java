package DataStructure.Lab10.Task2;

public class TapChi extends AnPham {
    private String ten;

    public TapChi(String tieuDe, String tacGia, int soTrang, int namXuatBan, int gia, String ten) {
        super(tieuDe, tacGia, soTrang, namXuatBan, gia);
        this.ten = ten;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "ten='" + ten + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                ", namXuatBan=" + namXuatBan +
                ", gia=" + gia +
                '}';
    }
}

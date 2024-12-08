package DataStructure.Lab10.Task2;

import java.util.List;

public class SachKhamKhao extends AnPham {
    private String linhVuc;
    private List<ChuongSach> danhSachChuong;

    public SachKhamKhao(String tieuDe, String tacGia, int soTrang, int namXuatBan, int gia, String linhVuc, List<ChuongSach> danhSachChuong) {
        super(tieuDe, tacGia, soTrang, namXuatBan, gia);
        this.linhVuc = linhVuc;
        this.danhSachChuong = danhSachChuong;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SachKhamKhao{" +
                "linhVuc='" + linhVuc + '\'' +
                ", danhSachChuong=" + danhSachChuong +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                ", namXuatBan=" + namXuatBan +
                ", gia=" + gia +
                '}';
    }
}

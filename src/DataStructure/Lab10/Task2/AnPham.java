package DataStructure.Lab10.Task2;

public class AnPham {
    protected String tieuDe, tacGia;
    protected int soTrang, namXuatBan, gia;

    public AnPham(String tieuDe, String tacGia, int soTrang, int namXuatBan, int gia) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getGia() {
        return gia;
    }
}

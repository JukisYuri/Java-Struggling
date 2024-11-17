package JavaBasic.EX21;

import java.util.Date;

public class GiangVien extends Staff {
    private double thulaoGG;

    public GiangVien(String ten, String namSinh, double luong, String ngaynhanviec, PhongBan PBK, double thulaoGG) {
        super(ten, namSinh, luong, ngaynhanviec, PBK);
        this.thulaoGG = thulaoGG;
    }
    public double salary() {
        return getLuong() + this.thulaoGG;
    }
}

package JavaBasic.EX21;

import java.util.Date;

public class NVQL extends Staff {
    private double phucapChucVu;

    public NVQL(String ten, String namSinh, double luong, String ngaynhanviec, PhongBan PBK, double phucapChucVu) {
        super(ten, namSinh, luong, ngaynhanviec, PBK);
        this.phucapChucVu = phucapChucVu;
    }
    public double salary(){
        return getLuong() + this.phucapChucVu;

    }
}

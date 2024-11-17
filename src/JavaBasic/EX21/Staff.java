package JavaBasic.EX21;

import java.util.Date;

public class Staff extends Human {
    private double luong;
    private String ngaynhanviec;
    private PhongBan PBK;

    public Staff(String ten, String namSinh, double luong, String ngaynhanviec, PhongBan PBK) {
        super(ten, namSinh);
        this.luong = luong;
        this.ngaynhanviec = ngaynhanviec;
        this.PBK = PBK;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "luong=" + luong +
                ", ngaynhanviec=" + ngaynhanviec +
                ", PBK=" + PBK +
                ", ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                '}';
    }

    public double getLuong() {
        return luong;
    }

    public String getNgaynhanviec() {
        return ngaynhanviec;
    }

    public PhongBan getPBK() {
        return PBK;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setNgaynhanviec(String ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }

    public void setPBK(PhongBan PBK) {
        this.PBK = PBK;
    }
}

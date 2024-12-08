package DataStructure.Lab10.Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DanhMucAnPham {
    private List<AnPham> danhSachAnPham;
    static final String GREEN = "\u001B[32m";
    static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";

    public DanhMucAnPham(List<AnPham> danhSachAnPham) {
        this.danhSachAnPham = danhSachAnPham;
    }

    void checkAnPham() {
        danhSachAnPham.forEach(anPham -> {
            System.out.println(anPham instanceof SachKhamKhao
                    ?  YELLOW + anPham.getTieuDe() + RESET + " là sách kham khảo"
                    :  YELLOW + anPham.getTieuDe() + RESET + " là tạp chí");
        });
    }

    boolean checkAnPhamVaThoiGianXuatBan(int limitOfYear) {
        for (AnPham anPham : danhSachAnPham) {
            if (anPham instanceof TapChi){
                if(LocalDate.now().getYear() - anPham.getNamXuatBan() >= limitOfYear){
                    return true;
                }
            }
        }
        return false;
    }

    boolean check2AnPhamCungLoaiVaCungTacGia(AnPham otherAnPham) {
        for (AnPham anPham : danhSachAnPham) {
            if((anPham instanceof TapChi && otherAnPham instanceof TapChi) || (anPham instanceof SachKhamKhao && otherAnPham instanceof SachKhamKhao)){
                if(anPham.getTacGia().equals(otherAnPham.getTacGia())){
                    return true;
                }
            }
        }
        return false;
    }

    int tongTienAnPham(){
        int totalCost = 0;
        for (AnPham anPham : danhSachAnPham) {
            totalCost += anPham.getGia();
        }
        return totalCost;
    }

    AnPham anPhamCoNhieuTrangNhat(){
        AnPham result = null;
        int anPhamWithHighestNumberPages = 0;
        for (AnPham anPham : danhSachAnPham) {
            if (anPham instanceof SachKhamKhao) {
                if (anPham.getSoTrang() > anPhamWithHighestNumberPages) {
                    anPhamWithHighestNumberPages = anPham.getSoTrang();
                    result = anPham;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<ChuongSach> chuongSaches = new ArrayList<>();
        ChuongSach chuongSach1 = new ChuongSach("Khúc Ca Con Rối", 200);
        ChuongSach chuongSach2 = new ChuongSach("Vũ Điệu Cuối Cùng", 100);
        chuongSaches.add(chuongSach1);
        chuongSaches.add(chuongSach2);
        List<ChuongSach> chuongSaches2 = new ArrayList<>();
        ChuongSach chuongSach3 = new ChuongSach("Bản Giao Hưởng Đầu Đông", 150);
        ChuongSach chuongSach4 = new ChuongSach("Bản Giao Hưởng Đầu Hè", 100);
        chuongSaches2.add(chuongSach3);
        chuongSaches2.add(chuongSach4);
        SachKhamKhao sachKhamKhao = new SachKhamKhao("Câu chuyện cuối cùng của tiểu thư kỳ bí", "Dạ Miêu Quân", 300, 2005, 100000, "Lightnovel", chuongSaches);
        SachKhamKhao sachKhamKhao2 = new SachKhamKhao("Huyền Tích Ánh Dương", "Akaros", 250, 2005, 100000, "Lightnovel", chuongSaches2);
        TapChi tapChi = new TapChi("Thời Trang", "Unknown", 10, 2002, 5000, "Giày Dép");
        List<AnPham> danhSachAnPham = new ArrayList<>();
        danhSachAnPham.add(sachKhamKhao);
        danhSachAnPham.add(sachKhamKhao2);
        danhSachAnPham.add(tapChi);
        DanhMucAnPham danhMucAnPham = new DanhMucAnPham(danhSachAnPham);
        danhMucAnPham.checkAnPham();
        System.out.println("--------------------------------");
        System.out.println("Ấn phẩm có phải là tạp chí và thời gian xuất bản cách 10 năm? " + GREEN + danhMucAnPham.checkAnPhamVaThoiGianXuatBan(10) + RESET);
        System.out.println("2 ấn phẩm có cùng loại và tác giả? " + GREEN + danhMucAnPham.check2AnPhamCungLoaiVaCungTacGia(sachKhamKhao) + RESET);
        System.out.println("Tổng số tiền tất cả ấn phẩm: " + GREEN + danhMucAnPham.tongTienAnPham() + RESET);
        System.out.println("Ấn phẩm với nhiều trang nhất: " + "\n" + GREEN + danhMucAnPham.anPhamCoNhieuTrangNhat() + RESET);
    }
}

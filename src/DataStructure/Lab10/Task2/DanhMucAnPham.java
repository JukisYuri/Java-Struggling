package DataStructure.Lab10.Task2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

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

    boolean checkAnPhamVaThoiGianXuatBanJava8(int limitOfYear){
        return danhSachAnPham.stream()
                .anyMatch(anPham -> anPham instanceof TapChi && LocalDate.now().getYear() - anPham.getNamXuatBan() >= limitOfYear);
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

    boolean check2AnPhamCungLoaiVaCungTacGiaJava8(AnPham otherAnPham){
        return danhSachAnPham.stream()
                .anyMatch(anPham -> (anPham instanceof TapChi && otherAnPham instanceof TapChi || anPham instanceof SachKhamKhao && otherAnPham instanceof SachKhamKhao)
                                            && anPham.getTacGia().equals(otherAnPham.getTacGia()));
    }

    int tongTienAnPham(){
        int totalCost = 0;
        for (AnPham anPham : danhSachAnPham) {
            totalCost += anPham.getGia();
        }
        return totalCost;
    }

    int tongTienAnPhamJava8(){
        return danhSachAnPham.stream()
                .mapToInt(AnPham::getGia)
                .sum();
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

    AnPham anPhamCoNhieuTrangNhatJava8(){
        return danhSachAnPham.stream()
                .filter(anPham -> anPham instanceof SachKhamKhao)
                .max(Comparator.comparing(AnPham::getSoTrang)).orElse(null); // dùng max thì dùng filter, vì anymatch trả ra boolean
    }

    boolean anPhamCoChuaTapChiCoTenChoTruoc(){
        for (AnPham anPham : danhSachAnPham){
            if(anPham instanceof TapChi){
                if(!anPham.getTieuDe().isBlank()){
                    return true;
                }
            }
        }
        return false;
    }

    boolean anPhamCoChuaTapChiCoTenChoTruocJava8(){
        return danhSachAnPham.stream()
                .anyMatch(anPham -> anPham instanceof TapChi && !anPham.getTieuDe().isBlank());
    }

    List<AnPham> danhSachTapChiXuatBan(int yearResult){
        List<AnPham> danhSach = new ArrayList<>();
        for (AnPham anPham : danhSachAnPham) {
            if(anPham instanceof TapChi){
                if(LocalDate.now().getYear() - anPham.getNamXuatBan() >= yearResult){
                    danhSach.add(anPham);
                }
            }
        }
        return danhSach;
    }

    List<AnPham> danhSachTapChiXuatBanJava8(int yearResult){
        return danhSachAnPham.stream()
                .filter(anPham -> anPham instanceof TapChi && LocalDate.now().getYear() - anPham.getNamXuatBan() >= yearResult)
                .collect(Collectors.toList());
    }

    List<AnPham> sapXepAnPham(){
        List<AnPham> danhSach = new ArrayList<>(danhSachAnPham);
        Comparator<AnPham> comparator = Comparator.comparing(AnPham::getTieuDe)
                                                .thenComparing(Comparator.comparing(AnPham::getNamXuatBan).reversed());
        danhSach.sort(comparator);
        return danhSach;
    }

    Map<Integer, Integer> thongKeSoLuongAnPham(){
        Map<Integer, Integer> result = new TreeMap<>();
        for(AnPham anPham : danhSachAnPham){
            int namXuatBan = anPham.getNamXuatBan();
            result.put(namXuatBan, result.getOrDefault(namXuatBan, 0) + 1);
        }
        return result;
    }

    Map<Integer, Long> thongKeSoLuongAnPhamJava8(){
        return danhSachAnPham.stream()
                .collect(Collectors.groupingBy(AnPham::getNamXuatBan, Collectors.counting()));
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
        SachKhamKhao sachKhamKhao2 = new SachKhamKhao("Huyền Tích Ánh Dương", "Akaros", 250, 2007, 100000, "Lightnovel", chuongSaches2);
        TapChi tapChi = new TapChi("Thời Trang", "Unknown", 10, 2002, 5000, "Giày Dép");
        List<AnPham> danhSachAnPham = new ArrayList<>();
        danhSachAnPham.add(sachKhamKhao);
        danhSachAnPham.add(sachKhamKhao2);
        danhSachAnPham.add(tapChi);
        DanhMucAnPham danhMucAnPham = new DanhMucAnPham(danhSachAnPham);
        danhMucAnPham.checkAnPham();

        List<Object> outputAnPham = List.of(
            "--------------------------------",
            "Ấn phẩm có phải là tạp chí và thời gian xuất bản cách 10 năm? " + GREEN + danhMucAnPham.checkAnPhamVaThoiGianXuatBan(10) + RESET,
                                                                                       danhMucAnPham.checkAnPhamVaThoiGianXuatBanJava8(10) + "\n",
            "2 ấn phẩm có cùng loại và tác giả? " + GREEN + danhMucAnPham.check2AnPhamCungLoaiVaCungTacGia(sachKhamKhao) + RESET,
                                                            danhMucAnPham.check2AnPhamCungLoaiVaCungTacGiaJava8(sachKhamKhao) + "\n",
            "Tổng số tiền tất cả ấn phẩm: " + GREEN + danhMucAnPham.tongTienAnPham() + RESET,
                                                      danhMucAnPham.tongTienAnPhamJava8() + "\n",
            "Ấn phẩm với nhiều trang nhất: " + "\n" + GREEN + danhMucAnPham.anPhamCoNhieuTrangNhat() + RESET,
                                                              danhMucAnPham.anPhamCoNhieuTrangNhatJava8() + "\n",
            "Ấn phẩm có chứa tạp chí và có tên cho trước: " + GREEN + danhMucAnPham.anPhamCoChuaTapChiCoTenChoTruoc() + RESET,
                                                                      danhMucAnPham.anPhamCoChuaTapChiCoTenChoTruocJava8() + "\n",
            "Danh sách tạp chí xuất bản từ 1 năm về trước: " + "\n" + GREEN + danhMucAnPham.danhSachTapChiXuatBan(1) + RESET,
                                                                              danhMucAnPham.danhSachTapChiXuatBanJava8(1) + "\n",
            "Sắp xếp ẩn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản: " + "\n" + GREEN + danhMucAnPham.sapXepAnPham() + RESET  + "\n",
            "Thống kê số lượng ấn phẩm theo năm xuất bản: " + GREEN + danhMucAnPham.thongKeSoLuongAnPham() + RESET,
                                                                      danhMucAnPham.thongKeSoLuongAnPhamJava8() + "\n"
        );
        outputAnPham.forEach(System.out::println);
    }
}

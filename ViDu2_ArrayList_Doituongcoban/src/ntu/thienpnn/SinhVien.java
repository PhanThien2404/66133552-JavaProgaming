package ntu.thienpnn;

import java.util.ArrayList;
import java.util.List;


class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    
    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    
    // Getter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }
    

    public String toString() {
        return String.format(" Mã: "    }
}


public class QuanLySinhVien {
    private List<SinhVien> danhSachSV;
    
    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }
    
 
    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
        System.out.println("Đã thêm: " + sv.getHoTen());
    }
    

    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }
    

    public SinhVien timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) {
            return null;
        }
        
        SinhVien svCaoNhat = danhSachSV.get(0);
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
                svCaoNhat = sv;
            }
        }
        return svCaoNhat;
    }
    

    public double tinhDiemTrungBinhLop() {
        if (danhSachSV.isEmpty()) {
            return 0;
        }
        
        double tong = 0;
        for (SinhVien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }
        return tong / danhSachSV.size();
    }
    

    public List<SinhVien> locSinhVienTheoDiem(double diemToiThieu) {
        List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() >= diemToiThieu) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }
    

    public void sapXepTheoDiem() {
        // Sử dụng bubble sort
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                
                    SinhVien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }
    

    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        System.out.println(String.format(
            "STT", "Mã SV", "Họ tên", "Điểm TB"));
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < danhSachSV.size(); i++) {
            SinhVien sv = danhSachSV.get(i);
            System.out.println(String.format(
                i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB()));
        }
    }
    
 
    public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(maSV)) {
                SinhVien svBiXoa = danhSachSV.remove(i);
                System.out.println("Đã xóa: " + svBiXoa.getHoTen());
                return true;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
        return false;
    }
    

    public void hienThiHaiSinhVienDauTien() {
        if (danhSachSV.size() >= 2) {
            List<SinhVien> subList = danhSachSV.subList(0, 2);
            System.out.println("\nHai sinh viên đầu tiên:");
            subList.forEach(System.out::println);
        }
    }
}
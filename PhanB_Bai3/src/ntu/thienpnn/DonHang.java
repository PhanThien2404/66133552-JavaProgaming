package ntu.thienpnn;

import java.time.LocalDate;
import java.util.List;

public class DonHang {
    private String maDH;
    private String tenKH;
    private List<String> danhSachSanPham;
    private double tongTien;
    private LocalDate ngayDat;

    public DonHang(String maDH, String tenKH, List<String> danhSachSanPham, double tongTien, LocalDate ngayDat) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.danhSachSanPham = danhSachSanPham;
        this.tongTien = tongTien;
        this.ngayDat = ngayDat;
    }

    public String getMaDH() { return maDH; }
    public String getTenKH() { return tenKH; }
    public double getTongTien() { return tongTien; }
    public LocalDate getNgayDat() { return ngayDat; }


    public String toString() {
        return String.format("Mã: %s | KH: %-10s | Tiền: %,.0f | Ngày: %s", 
                              maDH, tenKH, tongTien, ngayDat);
    }
}
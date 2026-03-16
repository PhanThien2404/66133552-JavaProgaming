package ntu.thienpnn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSP() { return maSP; }
    public String getTenSP() { return tenSP; }
    public double getGia() { return gia; }
    public int getSoLuong() { return soLuong; }
    public String toString() {
        return "Mã SP: " + maSP + " | Tên: " + tenSP + " | Giá: " + gia + " | Số lượng: " + soLuong;
    }
}

 class QuanLySanPham {
    private ArrayList<SanPham> danhSachSP;

    public QuanLySanPham() {
        this.danhSachSP = new ArrayList<>();
    }


    public void themSanPham(SanPham sp) {
        danhSachSP.add(sp);
        System.out.println("-> Đã thêm sản phẩm thành công!");
    }


    public void xoaSanPham(String maSP) {
        boolean removed = danhSachSP.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(maSP));
        if (removed) {
            System.out.println("-> Đã xóa sản phẩm có mã: " + maSP);
        } else {
            System.out.println("-> Không tìm thấy sản phẩm với mã: " + maSP);
        }
    }


    public void timSanPhamTheoTen(String tuKhoa) {
        boolean found = false;
        System.out.println("--- Kết quả tìm kiếm cho '" + tuKhoa + "' ---");
        for (SanPham sp : danhSachSP) {
            if (sp.getTenSP().toLowerCase().contains(tuKhoa.toLowerCase())) {
                System.out.println(sp);
                found = true;
            }
        }
        if (!found) System.out.println("-> Không tìm thấy sản phẩm nào phù hợp.");
    }


    public void sapXepTheoGia(boolean tangDan) {
        Collections.sort(danhSachSP, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                if (tangDan) {
                    return Double.compare(sp1.getGia(), sp2.getGia());
                } else {
                    return Double.compare(sp2.getGia(), sp1.getGia());
                }
            }
        });
        System.out.println("-> Đã sắp xếp danh sách theo giá " + (tangDan ? "tăng dần." : "giảm dần."));
    }


    public void tinhTongGiaTriKho() {
        double tongGiaTri = 0;
        for (SanPham sp : danhSachSP) {
            tongGiaTri += sp.getGia() * sp.getSoLuong();
        }
        System.out.println("-> Tổng giá trị kho hàng: " + tongGiaTri);
    }


    public void lietKeSapHetHang() {
        boolean found = false;
        System.out.println("--- Các sản phẩm sắp hết hàng (< 10) ---");
        for (SanPham sp : danhSachSP) {
            if (sp.getSoLuong() < 10) {
                System.out.println(sp);
                found = true;
            }
        }
        if (!found) System.out.println("-> Không có sản phẩm nào sắp hết hàng.");
    }


    public void hienThiDanhSach() {
        if (danhSachSP.isEmpty()) {
            System.out.println("-> Danh sách sản phẩm trống.");
            return;
        }
        System.out.println("--- Danh Sách Sản Phẩm ---");
        for (SanPham sp : danhSachSP) {
            System.out.println(sp);
        }
    }
}
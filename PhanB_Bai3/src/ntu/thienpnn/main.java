package ntu.thienpnn;

import java.time.LocalDate;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        QuanLyDonHang ql = new QuanLyDonHang();

        // 1. Thêm dữ liệu mẫu
        ql.themDonHang(new DonHang("DH01", "Hoàng", Arrays.asList("iPhone 15"), 25000000, LocalDate.of(2024, 1, 15)));
        ql.themDonHang(new DonHang("DH02", "Minh", Arrays.asList("Chuột", "Phím"), 1500000, LocalDate.of(2024, 1, 10)));
        ql.themDonHang(new DonHang("DH03", "Hoàng", Arrays.asList("Sạc dự phòng"), 500000, LocalDate.of(2024, 1, 20)));

        // 2. Thực hiện các chức năng
        System.out.println("=== TỔNG DOANH THU ===");
        System.out.println(String.format("%,.0f VNĐ", ql.tinhTongDoanhThu()));

        System.out.println("\n=== ĐƠN HÀNG GIÁ TRỊ CAO NHẤT ===");
        System.out.println(ql.timDonHangCaoNhat());

        System.out.println("\n=== THỐNG KÊ THEO KHÁCH HÀNG ===");
        ql.thongKeTheoKhachHang();

        System.out.println("\n=== DANH SÁCH SẮP XẾP THEO NGÀY ===");
        ql.layDanhSachSapXepTheoNgay().forEach(System.out::println);
    }
}
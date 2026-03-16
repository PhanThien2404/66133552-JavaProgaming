package ntu.thienpnn;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyDonHang {
    private ArrayList<DonHang> danhSachDH = new ArrayList<>();

    public void themDonHang(DonHang dh) {
        danhSachDH.add(dh);
    }

    public DonHang timDonHangCaoNhat() {
        return danhSachDH.stream()
                .max(Comparator.comparingDouble(DonHang::getTongTien))
                .orElse(null);
    }

    public void thongKeTheoKhachHang() {
        Map<String, Long> thongKe = danhSachDH.stream()
                .collect(Collectors.groupingBy(DonHang::getTenKH, Collectors.counting()));
        thongKe.forEach((ten, sl) -> System.out.println(" - " + ten + ": " + sl + " đơn hàng"));
    }

    public double tinhTongDoanhThu() {
        return danhSachDH.stream().mapToDouble(DonHang::getTongTien).sum();
    }

    public List<DonHang> layDanhSachSapXepTheoNgay() {
        return danhSachDH.stream()
                .sorted(Comparator.comparing(DonHang::getNgayDat))
                .collect(Collectors.toList());
    }
}
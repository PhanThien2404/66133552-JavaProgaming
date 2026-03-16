package ntu.thienpnn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham qlsp = new QuanLySanPham();
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;

        do {
            System.out.println("\n====== QUẢN LÝ SẢN PHẨM ======");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Xóa sản phẩm theo mã");
            System.out.println("4. Tìm sản phẩm theo tên");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("6. Tính tổng giá trị kho hàng");
            System.out.println("7. Liệt kê sản phẩm sắp hết hàng");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            try {
                luaChon = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                continue;
            }

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã SP: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhập tên SP: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập giá SP: ");
                    double gia = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập số lượng: ");
                    int soLuong = Integer.parseInt(scanner.nextLine());
                    
                    SanPham sp = new SanPham(ma, ten, gia, soLuong);
                    qlsp.themSanPham(sp);
                    break;
                case 2:
                    qlsp.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhập mã SP cần xóa: ");
                    String maXoa = scanner.nextLine();
                    qlsp.xoaSanPham(maXoa);
                    break;
                case 4:
                    System.out.print("Nhập từ khóa tên SP cần tìm: ");
                    String tuKhoa = scanner.nextLine();
                    qlsp.timSanPhamTheoTen(tuKhoa);
                    break;
                case 5:
                    System.out.print("Bạn muốn sắp xếp tăng dần (1) hay giảm dần (2)? Nhập 1 hoặc 2: ");
                    String kieuSapXep = scanner.nextLine();
                    if (kieuSapXep.equals("1")) {
                        qlsp.sapXepTheoGia(true);
                        qlsp.hienThiDanhSach();
                    } else if (kieuSapXep.equals("2")) {
                        qlsp.sapXepTheoGia(false);
                        qlsp.hienThiDanhSach();
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;
                case 6:
                    qlsp.tinhTongGiaTriKho();
                    break;
                case 7:
                    qlsp.lietKeSapHetHang();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không tồn tại, vui lòng nhập lại.");
            }
        } while (luaChon != 0);
        
        scanner.close();
    }
}
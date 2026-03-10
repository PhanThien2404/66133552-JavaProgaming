
public class main {

	public static void main(String[] args) {
        System.out.println("=== TEST 1: Khởi tạo mặc định ===");
        SanPham sp1 = new SanPham();
        sp1.hienThiThongTin();

     
        System.out.println("=== TEST 2: Dữ liệu hợp lệ ===");
        SanPham sp2 = new SanPham("SP001", "Laptop Dell", 15000000, 2);
        sp2.hienThiThongTin();

        
        System.out.println("=== TEST 3: Dữ liệu không hợp lệ (Test Validation) ===");
        
        SanPham sp3 = new SanPham("   ", "Chuột không dây", -50000, -3);
        sp3.hienThiThongTin();

       
        System.out.println("=== TEST 4: Cập nhật lại SP1 bằng Setter ===");
        sp1.setMaSP("SP002");
        sp1.setTenSP("Bàn phím cơ");
        sp1.setGia(1200000);
        sp1.setSoLuong(5);
        sp1.hienThiThongTin();

	}

}

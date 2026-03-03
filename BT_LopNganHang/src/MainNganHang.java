class  TaiKhoanNganHang {
    String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;


    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }


    void guiTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Đã gửi " + soTien + " vào tài khoản " + soTaiKhoan);
        } else {
            System.out.println("Số tiền gửi không hợp lệ!");
        }
    }


    boolean rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            this.soDu -= soTien;
            System.out.println("Đã rút " + soTien + " từ tài khoản " + soTaiKhoan);
            return true;
        } else {
            System.out.println("Rút tiền thất bại! (Số dư không đủ hoặc số tiền không hợp lệ)");
            return false;
        }
    }


    void chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {
        System.out.println("\nĐang thực hiện chuyển khoản...");

        if (this.rutTien(soTien)) {

            taiKhoanKhac.guiTien(soTien);
            System.out.println("Chuyển tiền thành công từ " + this.tenChuTaiKhoan + " sang " + taiKhoanKhac.tenChuTaiKhoan);
        } else {
            System.out.println("Chuyển tiền thất bại!");
        }
    }


    void hienThiSoDu() {
        System.out.printf("Tài khoản: %s | Chủ thẻ: %s | Số dư: %.0f VND\n", 
                          soTaiKhoan, tenChuTaiKhoan, soDu);
    }
}
public class MainNganHang {
    public static void main(String[] args) {

        TaiKhoanNganHang tkAn = new TaiKhoanNganHang("123", "Nguyen Van An", 5000000);
        TaiKhoanNganHang tkBinh = new TaiKhoanNganHang("456", "Tran Thi Binh", 1000000);

        System.out.println("--- Trạng thái ban đầu ---");
        tkAn.hienThiSoDu();
        tkBinh.hienThiSoDu();


        tkAn.guiTien(2000000);


        tkAn.chuyenTien(tkBinh, 3000000);

        System.out.println("\n--- Trạng thái sau giao dịch ---");
        tkAn.hienThiSoDu();
        tkBinh.hienThiSoDu();
    }
}

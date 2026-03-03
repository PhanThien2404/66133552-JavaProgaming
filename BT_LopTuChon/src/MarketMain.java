class Bitcoin {
    String phienBan;      
    double giaHienTai;    
    double vonHoaThiTruong; 
    double tongCung;     


    public Bitcoin(String phienBan, double giaHienTai, double tongCung) {
        this.phienBan = phienBan;
        this.giaHienTai = giaHienTai;
        this.tongCung = tongCung;
        this.vonHoaThiTruong = giaHienTai * tongCung;
    }


    public void daoBlockMoi(double phanThuong) {
        this.tongCung += phanThuong;
        capNhatVonHoa();
        System.out.println("--- ĐÃ ĐÀO ĐƯỢC BLOCK MỚI ---");
        System.out.println("Phần thưởng: " + phanThuong + " BTC");
        System.out.println("Tổng cung mới: " + tongCung + " BTC");
    }


    public void bienDongGia(double phanTram) {
        this.giaHienTai += this.giaHienTai * (phanTram / 100);
        capNhatVonHoa();
        String trangThai = (phanTram >= 0) ? "TĂNG" : "GIẢM";
        System.out.printf("Thị trường biến động: %s %.2f%%\n", trangThai, Math.abs(phanTram));
        System.out.printf("Giá BTC mới: %.2f USD\n", giaHienTai);
    }


    private void capNhatVonHoa() {
        this.vonHoaThiTruong = this.giaHienTai * this.tongCung;
    }


    public void hienThiThongSo() {
        System.out.println("================================");
        System.out.println("BẢNG THEO DÕI BITCOIN");
        System.out.println("Phiên bản: " + phienBan);
        System.out.printf("Giá: $%,.2f\n", giaHienTai);
        System.out.printf("Tổng cung: %,.0f BTC\n", tongCung);
        System.out.printf("Vốn hóa: $%,.0f\n", vonHoaThiTruong);
        System.out.println("================================");
    }
}
public class MarketMain {
    public static void main(String[] args) {

        Bitcoin btc = new Bitcoin("v0.26.0", 65000, 19600000);


        btc.hienThiThongSo();


        btc.bienDongGia(5.5);


        btc.daoBlockMoi(3.125); 


        btc.bienDongGia(-10.0);


        btc.hienThiThongSo();
    }
}

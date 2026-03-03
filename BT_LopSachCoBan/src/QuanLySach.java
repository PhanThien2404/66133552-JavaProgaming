class Sach {

    String tieuDe;
    String tacGia;
    double gia;
    int soTrang;


    public Sach(String tieuDe, String tacGia, double gia, int soTrang) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }


    public void hienThiThongTin() {
        System.out.println("----------------------------");
        System.out.println("Tên sách: " + tieuDe);
        System.out.println("Tác giả:  " + tacGia);
        System.out.println("Giá:      " + gia + " VNĐ");
        System.out.println("Số trang: " + soTrang + " trang");
    }
}
public class QuanLySach {
    public static void main(String[] args) {
        Sach sach1 = new Sach("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 55000, 150);
        Sach sach2 = new Sach("Số Đỏ", "Vũ Trọng Phụng", 85000, 220);
        Sach sach3 = new Sach("Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "Nguyễn Nhật Ánh", 120000, 300);

        System.out.println("=== DANH SÁCH CÁC CUỐN SÁCH ===");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}
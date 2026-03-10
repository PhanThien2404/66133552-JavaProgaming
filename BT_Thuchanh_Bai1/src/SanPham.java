public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;


    public SanPham() {
        this.maSP = "0000";
        this.tenSP = "Không có tên sản phẩm";
        this.gia = 1.0; 
        this.soLuong = 0;
    }

 
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }


    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }


    public void setMaSP(String maSP) {
        
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Lỗi: Mã sản phẩm không được rỗng!");
            this.maSP = "0000"; 
        }
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGia(double gia) {

        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Lỗi: Giá phải lớn hơn 0!");
            this.gia = 1.0; 
        }
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng phải lớn hơn hoặc bằng 0!");
            this.soLuong = 0; 
    }

    }
    
    public double tinhThanhTien() {
        return this.gia * this.soLuong;
    }


    public void hienThiThongTin() {
        System.out.println("Mã SP: " + this.maSP);
        System.out.println("Tên SP: " + this.tenSP);
        System.out.println("Giá: " + this.gia);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Thành tiền: " + tinhThanhTien());
        System.out.println("-------------------------");
    }
}
package thienpnn_QLNV;

public class NhanVien {
   //Thuộc tính
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	// Hàm tạo
//	public NhanVien()
//	{
		
//	}
//	public NhanVien(String maNhanVien, String tenNhanVien, double luonhCoBan )
//	{
//		this.maNV = maNhanVien;
//		this.hoTen = tenNhanVien;
//		this.luongCoBan = luongCoBan;
//	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien() {
		super();
	}
	public double tinhLuong()
	{
		return luongCoBan;
	}
	@Override
	public String toString() {
		String chuoiXuat="";
		chuoiXuat = chuoiXuat + "Mã NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHọ tên: " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLương cơ bản: " + this.luongCoBan;
		return chuoiXuat;
	//	return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	
	public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
}

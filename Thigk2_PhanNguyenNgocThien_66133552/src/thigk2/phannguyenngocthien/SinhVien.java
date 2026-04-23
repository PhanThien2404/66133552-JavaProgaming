package thigk2.phannguyenngocthien;

public class SinhVien {
   private String maSV;
   private String hoTen;
   private int namSinh;
   private String lop;
   public SinhVien(String maSV, String hoTen, int namSinh, String lop) {
	this.maSV = maSV;
	this.hoTen = hoTen;
	this.namSinh = namSinh;
	this.lop = lop;
   }
   public String getMaSV() {
	return maSV;
   }
   public void setMaSV(String maSV) {
	this.maSV = maSV;
   }
   public String getHoTen() {
	return hoTen;
   }
   public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
   }
   public int getNamSinh() {
	return namSinh;
   }
   public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
   }
   public String getLop() {
	return lop;
   }
   public void setLop(String lop) {
	this.lop = lop;
   }
   @Override
   public String toString() {
	return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", lop=" + lop + "]";
   }
   
   
}

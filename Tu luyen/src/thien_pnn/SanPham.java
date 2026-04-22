package thien_pnn;
// import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
    
    public double getThueNhapKhau()
    {
    	return donGia * 0.1;
    }
    
   // public void Nhap()
   // {
   // 	Scanner scanner = new Scanner(System.in);
   // 	System.out.print("Nhap ten san pham: ");
   // 	tenSP = scanner.nextLine();
   // 	System.out.print("Nhập đơn giá: ");
   //     donGia = scanner.nextDouble();
   //     System.out.print("Nhập giảm giá: ");
   //     giamGia = scanner.nextDouble();
    	
   // }
   // public void xuat()
   // {
    //	System.out.println("Ten san pham la: " + tenSP);
    //	System.out.println("Đơn giá: " + donGia);
    //    System.out.println("Giảm giá: " + giamGia);
    //    System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
   // }
}

package thien_pnn;
import java.util.Scanner;

public class Chay {

	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
        
        SanPham sp1 = new SanPham();
        
        System.out.println("--- NHẬP THÔNG TIN SẢN PHẨM ---");
        
       

        System.out.print("Nhap ten san pham: ");
        String ten = scanner.nextLine();
        sp1.setTenSP(ten);
        
        System.out.print("Nhập đơn giá: ");
        double gia = scanner.nextDouble();
        sp1.setDonGia(gia);
        
     
        System.out.print("Nhập giảm giá: ");
        double giamGia = scanner.nextDouble();
        sp1.setGiamGia(giamGia);
        
        System.out.println("\n--- THÔNG TIN SẢN PHẨM VỪA NHẬP ---");
      
        System.out.println (" Tên sản phẩm: " + sp1.getTenSP());
        System.out.println ( "Ten don gia: " + sp1.getDonGia());
        
        System.out.println (" Thuế nhập khẩu là : " + sp1.getThueNhapKhau());
   
        scanner.close();
        
	}

}

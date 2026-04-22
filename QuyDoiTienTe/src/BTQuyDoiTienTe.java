
import java.util.Scanner;

public class BTQuyDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- CHƯƠNG TRÌNH QUY ĐỔI TIỀN TỆ ---");
        System.out.println("1. USD sang VND (Tỷ giá: 23,500)");
        System.out.println("2. EUR sang VND (Tỷ giá: 27,000)");
        System.out.print("Chọn loại tiền muốn đổi (1 hoặc 2): ");
        int chon = sc.nextInt();

        if (chon == 1) {
            System.out.print("Nhập số tiền USD: ");
            double usd = sc.nextDouble();
            System.out.println("Số tiền tương ứng: " + (usd * 23500) + " VND");
        } else if (chon == 2) {
            System.out.print("Nhập số tiền EUR: ");
            double eur = sc.nextDouble();
            System.out.println("Số tiền tương ứng: " + (eur * 27000) + " VND");
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
import java.util.Scanner;

public class BTQuyDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tyGia = 25000; 

        System.out.println("--- CHƯƠNG TRÌNH QUY ĐỔI TIỀN TỆ ---");
        System.out.println("1. USD sang VND");
        System.out.println("2. VND sang USD");
        System.out.print("Chọn chức năng (1 hoặc 2): ");
        int chon = scanner.nextInt();

        if (chon == 1) {

            System.out.print("Nhập số tiền USD: ");
            double usd = scanner.nextDouble();
            double vnd = usd * tyGia;
            System.out.printf("%.2f USD = %.0f VND\n", usd, vnd);
        } else if (chon == 2) {

            System.out.print("Nhập số tiền VND: ");
            double vnd = scanner.nextDouble();
            double usd = vnd / tyGia;
            System.out.printf("%.0f VND = %.2f USD\n", vnd, usd);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();
}
}
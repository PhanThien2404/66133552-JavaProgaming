import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GIA_BAC_1 = 1806;
        final double GIA_BAC_2 = 1866;
        final double GIA_BAC_3 = 2167;
        final double GIA_BAC_4 = 2729;
        final double GIA_BAC_5 = 3050;
        final double GIA_BAC_6 = 3151;
        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        double soDien = scanner.nextDouble();    
        if (soDien < 0) {
            System.out.println("Số điện không hợp lệ! Vui lòng nhập số lớn hơn hoặc bằng 0.");
        } else {
            double tongTien = 0;
            if (soDien <= 50) {
                tongTien = soDien * GIA_BAC_1;
            } else if (soDien <= 100) {
                tongTien = 50 * GIA_BAC_1 + (soDien - 50) * GIA_BAC_2;
            } else if (soDien <= 200) {
                tongTien = 50 * GIA_BAC_1 + 50 * GIA_BAC_2 + (soDien - 100) * GIA_BAC_3;
            } else if (soDien <= 300) {
                tongTien = 50 * GIA_BAC_1 + 50 * GIA_BAC_2 + 100 * GIA_BAC_3 + (soDien - 200) * GIA_BAC_4;
            } else if (soDien <= 400) {
                tongTien = 50 * GIA_BAC_1 + 50 * GIA_BAC_2 + 100 * GIA_BAC_3 + 100 * GIA_BAC_4 + (soDien - 300) * GIA_BAC_5;
            } else {
                tongTien = 50 * GIA_BAC_1 + 50 * GIA_BAC_2 + 100 * GIA_BAC_3 + 100 * GIA_BAC_4 + 100 * GIA_BAC_5 + (soDien - 400) * GIA_BAC_6;
            }
            System.out.printf("Số điện bạn đã sử dụng là: %.2f kWh\n", soDien);
            System.out.printf("Tổng tiền điện phải trả (Chưa VAT): %,.0f VNĐ\n", tongTien);
        }
        scanner.close();
    }
}
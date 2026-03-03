import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NhatKyCaNhan {
    private static final String FILE_NAME = "nhatky.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n--- NHẬT KÝ CÁ NHÂN ---");
            System.out.println("1. Viết nhật ký mới");
            System.out.println("2. Đọc lại nhật ký");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 
            switch (luaChon) {
                case 1:
                    vietNhatKy(scanner);
                    break;
                case 2:
                    docNhatKy();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
    public static void vietNhatKy(Scanner sc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            System.out.println("Nhập nội dung nhật ký (Nhấn Enter để lưu):");
            String noiDung = sc.nextLine();

            out.println("[" + dtf.format(now) + "]");
            out.println(noiDung);
            out.println("---------------------------");
            
            System.out.println("Đã lưu thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public static void docNhatKy() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("Bạn chưa có trang nhật ký nào.");
            return;
        }

        System.out.println("\n--- NỘI DUNG NHẬT KÝ ---");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        }
    }
}
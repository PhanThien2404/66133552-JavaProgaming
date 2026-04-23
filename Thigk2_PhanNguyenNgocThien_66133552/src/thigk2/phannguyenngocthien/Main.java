package thigk2.phannguyenngocthien;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * CÁCH GIẢI CHI TIẾT:
 * * - Câu 1: Sử dụng Scanner để nhận giá trị chiều cao (m) và cân nặng (kg) kiểu double. 
 * Tính BMI theo công thức: BMI = Cân nặng / (Chiều cao * Chiều cao). Dùng if-else để phân loại tình trạng cơ thể dựa trên chuẩn BMI của WHO.
 * * - Câu 2: 
 * + Dùng ArrayList<SinhVien> để quản lý danh sách sinh viên.
 * + Hard-code 3 sinh viên bằng cách khởi tạo đối tượng SinhVien và dùng phương thức add() đưa vào list. In danh sách bằng vòng lặp for-each.
 * + Nhập thêm 1 sinh viên: Dùng Scanner lấy dữ liệu từ bàn phím, khởi tạo SinhVien mới và add() vào danh sách, sau đó in lại.
 * + Lọc tuổi: Dùng hàm Year.now().getValue() để lấy năm hiện tại trên máy thực tế, trừ đi namSinh để ra tuổi. Nếu > 20 thì in ra.
 * * - Câu 3: Dùng Scanner đọc đối tượng File("numbers.txt"). Sử dụng vòng lặp while(fileScanner.hasNextInt()) để đọc từng số, 
 * in ra màn hình và đồng thời kiểm tra xem số đó có bằng giá trị X (đã định nghĩa sẵn) hay không. Cập nhật biến cờ boolean (isXFound).
 */


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Câu 1 : Tính chỉ số BMI");
		cau1_BMI(scanner);
		System.out.println("Câu 2 : Quản lý sinh viên");
		cau2_QuảnLySinhVien(scanner);
		System.out.println("Câu 3 : Đọc file và tìm kiếm");
		cau3_DocFile();
		
		scanner.close();
 
	}

}

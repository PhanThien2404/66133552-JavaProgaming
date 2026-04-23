package thigk2.phannguyenngocthien;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * CÁCH GIẢI CHO TỪNG CÂU:
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
		cau2_QuanLySinhVien(scanner);
		System.out.println("Câu 3 : Đọc file và tìm kiếm");
		cau3_DocFile();
		
		scanner.close();
 
	}
    // Hàm làm câu 1
	public static void cau1_BMI(Scanner scanner)
	{
		try
		{
			System.out.print("Nhập chiều cao: ");
			double chieuCao = Double.parseDouble(scanner.nextLine());
			System.out.print("Nhập cân nặng: ");
			double canNang = Double.parseDouble(scanner.nextLine());
			
			double bmi = canNang / (chieuCao * chieuCao);
			System.out.print("Chỉ số BMT là: %.2f\n");
			
			System.out.print("Tình trạng cơ thể: ");
			if (bmi < 18.5)
			{
				System.out.println("Gầy");
			}
			else if ( bmi >= 18.5 && bmi < 25 )
			{
				System.out.println("Bình thường");
			}
			else if ( bmi >= 25 && bmi < 30 )
			{
				System.out.println("Thừa cân");
			}
			else
			{
				System.out.println("Béo phì");
			} catch 
			{
				System.out.println("Nhập lại số hợp lệ");
			}
		}
	}
	
	// Hàm làm câu 2
	public static void cau2_QuanLySinhVien(Scanner scanner)
	{
		List<SinhVien> danhSachSV = new ArrayList<>();
		// Thông tin 3 sinh viên 
		danhSachSV.add(new SinhVien("66123" , "Nguyen Van A" , 2004 , "66CNTT1");
		danhSachSV.add(new SinhVien("66124" , "Tran Thi B" , 2006 , "66CNTT1");
		danhSachSV.add(new SinhVien("66125" , "Le Van C" , 2003 , "66CNTT2");
		
		System.out.println("Danh sách 3 sinh viên ban đầu : ");
		for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
		//Thêm 1 sinh viên bàn phím
		System.out.println("Nhập mã SV: ");
		String maSV = scanner.nextLine();
		System.out.println("Nhập họ tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Nhập năm sinh: ");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập lớp: ");
        String lop = scanner.nextLine();
	}
}

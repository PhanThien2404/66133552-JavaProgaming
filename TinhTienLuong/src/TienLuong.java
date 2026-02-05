import java.util.Scanner;
public class TienLuong {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Nhập số giờ làm: ");
		        double soGioLam = sc.nextDouble();
		        System.out.print("Nhập lương theo giờ: ");
		        double luongGio = sc.nextDouble();

		        double tongLuong;
		        if (soGioLam <= 40) {
		            tongLuong = soGioLam * luongGio;
		        } else {
		            tongLuong = (40 * luongGio) + ((soGioLam - 40) * luongGio * 1.5);
		        }

		        System.out.println("Tổng lương của nhân viên là: " + tongLuong);
		    }
	}


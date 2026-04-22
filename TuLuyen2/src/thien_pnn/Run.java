package thien_pnn;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten hoc sinh: ");
		String tenhs = sc.nextLine();
		hs1.setTen(tenhs);
		System.out.print("Nhap tuoi: ");
		int tuoihs = sc.nextInt();
		hs1.setNam(tuoihs);
		
		System.out.println("Ten hoc sinh: " + hs1.getTen());
		System.out.println("Nam hoc sinh: " + hs1.getNam());
		System.out.println("Tuoi hoc sinh: " + hs1.getTuoi());

	}

}

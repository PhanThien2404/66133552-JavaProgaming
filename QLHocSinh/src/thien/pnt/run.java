package thien.pnt;

import java.util.Scanner;
import java.util.ArrayList;

public class run {

	public static void main(String[] args) {
		// 2.a: Tạo mới 2 HS , hard-code dữ liệu
		
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Trần Văn A";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Trần thị Tươi", (short)12 , "6C");
		// IN ra màn hình
		System.out.print(hs1.toString());
	// 	System.out.print(hs2.toString());
		
		System.out.println("\nTên của HS 2 là : " + hs2.getTenHS());
		System.out.println("\nTuổi của HS 2 là : " + hs2.getTuoiHS());
		System.out.println("\nLớp của HS 2 là : " + hs2.getLopHS());
		// Nhập dữ liệu bàn phím
		Scanner banPhim = new Scanner(System.in);
		// Nhập dữ liệu cho học sinh thứ 3
		HocSinh hs3 = new HocSinh();
		// hỏi user nhập vào tên
		System.out.print("Mời nhập vào tên của học sinh thứ 3: ");
		String tenHS3 = banPhim.nextLine();
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập vào tuổi của học sinh thứ 3: ");
		short tuoiHS3 = banPhim.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Mời nhập vào lớp của học sinh thứ 3: ");
		String lopHS3 = banPhim.nextLine();
		hs3.setLopHS(lopHS3);
		
		// In học sinh 3 ra màn hình 
		
		System.out.print(hs3.toString());
		
		// Nhập danh sách N học sinh
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		// Nhập N
		int N = 3; // sinh viên code nhập n từ bàn phím
		
		for ( int i = 0 ; i < N ; i++ )
		{
			//
			// Nhập dữ liệu cho học sinh thứ i
			HocSinh hsi = new HocSinh();
			// hỏi user nhập vào tên
			System.out.print("Mời nhập vào tên của học sinh thứ : " +i);
			String tenHSi = banPhim.nextLine();
			hsi.setTenHS(tenHSi);
			
			System.out.print("Mời nhập vào tuổi của học sinh thứ : " +i);
			short tuoiHSi = banPhim.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			
			System.out.print("Mời nhập vào lớp của học sinh thứ : " +i);
			String lopHSi = banPhim.nextLine();
			hsi.setLopHS(lopHSi);
			// dựa vào danh sách
			dsHocSinh.add(hsi);
			
		}
		
		// In ra 
		for (int i = 0 ; i < N ; i++ )
		{
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		// Bổ sung thêm
		HocSinh hsThem = new HocSinh();
		// nhập từ bàn phím
		// .....
		
		
		// thêm vào ds
		dsHocSinh.add(hsThem);
		// In ra 
				for (int i = 0 ; i < N ; i++ )
				{
					System.out.println(dsHocSinh.get(i).toString());
				}
	    //5a
				// Tìm học sinh tên Hoa
				for ( int i = 0 ; i < N ; i++ )
				{
					HocSinh hsTim = dsHocSinh.get(i);
					if(hsTim.getTenHS() =="Hoa")
					{
						dsHocSinh.remove(hsTim);
						break;
					}
				}
				// In ra 
				for (int i = 0 ; i < N ; i++ )
				{
					System.out.println(dsHocSinh.get(i).toString());
				}	
		
	}

}

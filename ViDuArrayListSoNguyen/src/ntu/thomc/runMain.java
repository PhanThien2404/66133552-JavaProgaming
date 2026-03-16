package ntu.thomc;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// Khai báo biến danh sách , chứa các số nguyên
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		// a. Nhập 10 phần tử từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		for ( int i = 0 ; i < 10 ; i++ )
		{
		// Nhập 1 phần tử
		    // In ra một hướng dẫn cho người dùng
		System.out.print("Moi nhap phan tu thu " + i + ": ");
		// Cho user nhập , cất vào biến tạm
	    Integer tam = banPhim.nextInt();
        // Thêm vào cuối danh sách
	    dsSoNguyen.add(tam);
		}
		
		//b In ra danh sách vừa nhập
		System.out.print("DANH SACH VUA NHAP LA: \n");
//		for ( int i = 0 ; i< dsSoNguyen.size() ; i++ )
//		{
			// Lấy giá trị phần tử ở vị trí i , cất vào biến tạm
//			Integer tam = dsSoNguyen.get(i);
//			System.out.print(tam + " ");
//		}
		for (Integer x: dsSoNguyen)
		{
			System.out.print(x + " ");
		}
		
		//c. Đếm số phần tử chẵn
		int soLuongPTchan = 0;
		for (Integer x: dsSoNguyen)
		{
			if (x% 2 == 0 )
			{
				soLuongPTchan = soLuongPTchan + 1;
			}
		//	if (x% 2 == 0 )
		//	{
		//		soLuongPTchan = soLuongPTchan++;
		//	}
			System.out.println("So phan tu chan la: " + soLuongPTchan);
		}
		//d. Tính tổng các phần tử
		int TongAll=0;
		for (Integer x: dsSoNguyen)
		{
			if (x% 2 == 0 )
			{
				TongAll = TongAll +x;
			}
			System.out.println("Tong cac phan tu chan la : " + TongAll);
	}

  }
}

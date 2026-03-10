
public class Main {

	public static void main(String[] args) {
		System.out.println("--- KHỞI TẠO SÁCH ---");
        Sach s1 = new Sach("S01", "Lập trình Java", "John Doe", 2020);
        Sach s2 = new Sach("S02", "Cấu trúc dữ liệu", "Jane Doe", 1998); 
        

        Sach s3 = new Sach("S03", "AI tương lai", "AI Author", 2050); 
        
        System.out.println("\n--- THÔNG TIN BAN ĐẦU ---");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println("\n--- KIỂM TRA SÁCH CŨ ---");
        System.out.println("Sách '" + s1.getTenSach() + "' là sách cũ? " + s1.kiemTraSachCu());
        System.out.println("Sách '" + s2.getTenSach() + "' là sách cũ? " + s2.kiemTraSachCu());

        System.out.println("\n--- TEST MƯỢN / TRẢ SÁCH ---");
        s1.muonSach(); 
        s1.muonSach();
        System.out.println(s1.toString());
        
        s1.traSach();
        System.out.println(s1.toString());

	}

}

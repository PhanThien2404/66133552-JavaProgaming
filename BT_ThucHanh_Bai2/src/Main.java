
public class Main {

	public static void main(String[] args) {

        
        
        NhanVien nv1 = new NhanVien("NV01", "Nguyễn Văn A", 5000000, 4.5);
        
       
        NhanVien nv2 = new NhanVien("NV02", "Trần Thị B", 5000000, 3.2);
        

        NhanVien nv3 = new NhanVien("NV03", "Lê Văn C", 5000000, 2.5);


        System.out.println("--- DANH SÁCH NHÂN VIÊN ---");
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
        System.out.println(nv3.toString());
	}

}

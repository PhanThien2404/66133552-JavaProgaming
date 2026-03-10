
public class Main {

	public static void main(String[] args) {
		Diem d1 = new Diem(3, 4);  
        Diem d2 = new Diem(0, 0);   
        Diem d3 = new Diem(3, 4);   
        Diem d4 = new Diem();       
        
        System.out.println("Tọa độ d1: " + d1.toString());
        System.out.println("Tọa độ d2: " + d2.toString());
        
       
        double khoangCach = d1.tinhKhoangCach(d2);
        System.out.println("\nKhoảng cách giữa d1 và d2: " + khoangCach);
        

        System.out.println("\nd1 có trùng với d2 không? " + d1.kiemTraTrungNhau(d2));
        System.out.println("d1 có trùng với d3 không? " + d1.kiemTraTrungNhau(d3));
        System.out.println("d2 có trùng với d4 không? " + d2.kiemTraTrungNhau(d4));
        

        Diem d1DoiXung = d1.doiXungQuaGoc();
        System.out.println("\nĐiểm đối xứng của d1 qua gốc tọa độ là: " + d1DoiXung.toString());
	}

}

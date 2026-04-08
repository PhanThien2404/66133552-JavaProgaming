package thien.pnn;


public class run {

    public static void main(String[] args) {
        
        // In ra tên trường của sinh viên NTU
        System.out.println(SinhVienNTU.TEN_TRUONG);
        // In ra Hi, ...
        SinhVienNTU.sayHi();
        
        SinhVienNTU sv1 = new SinhVienNTU("Mai Cường Thọ", "KHMT-13");
        SinhVienNTU sv2 = new SinhVienNTU("Phạm Văn Nam", "CNPT-15");
        
        sv1.sayHello();
        sv2.sayHello();
        
    }
    
}
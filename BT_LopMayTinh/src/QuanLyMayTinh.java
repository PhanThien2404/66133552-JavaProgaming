class MayTinh {

    String hang;
    int ram;    
    int oCung;  
    double gia;


    public MayTinh(String hang, int ram, int oCung, double gia) {
        this.hang = hang;
        this.ram = ram;
        this.oCung = oCung;
        this.gia = gia;
    }


    public void kiemTraCauHinh() {
        System.out.println("--- THÔNG TIN MÁY TÍNH ---");
        System.out.println("Hãng: " + hang);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Ổ cứng: " + oCung + " GB");
        System.out.printf("Giá gốc: %.0f VND\n", gia);
    }

 
    public boolean coTheChoiGame() {
        return this.ram >= 8; 
    }


    public double tinhThue() {
        return this.gia * 0.1;
    }
}
public class QuanLyMayTinh {
    public static void main(String[] args) {

        MayTinh mt1 = new MayTinh("Dell", 4, 256, 12000000);
        

        MayTinh mt2 = new MayTinh("ASUS ROG", 16, 512, 35000000);


        mt1.kiemTraCauHinh();
        System.out.println("Có thể chơi game? " + (mt1.coTheChoiGame() ? "Có" : "Không (RAM yếu)"));
        System.out.printf("Thuế VAT (10%%): %.0f VND\n", mt1.tinhThue());

        System.out.println("\n----------------------------\n");


        mt2.kiemTraCauHinh();
        System.out.println("Có thể chơi game? " + (mt2.coTheChoiGame() ? "Có" : "Không (RAM yếu)"));
        System.out.printf("Thuế VAT (10%%): %.0f VND\n", mt2.tinhThue());
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("--- TEST TRƯỜNG HỢP 1: DÙNG CONSTRUCTOR MẶC ĐỊNH & SETTER ---");
        Laptop lap1 = new Laptop();
        lap1.setBrand("Lenovo");
        lap1.setModel("Legion 5");
        lap1.setPrice(1200.50); 
        lap1.displayInfo();

        System.out.println("\n--- TEST TRƯỜNG HỢP 2: DÙNG CONSTRUCTOR CÓ THAM SỐ (Cố tình nhập giá âm) ---");

        Laptop lap2 = new Laptop("Lenovo", "LOQ 15", -500.0);
        lap2.displayInfo();

        System.out.println("\n--- TEST TRƯỜNG HỢP 3: CẬP NHẬT LẠI GIÁ QUA SETTER ---");
        lap2.setPrice(850.0);
        System.out.println("Sau khi sửa giá:");
        lap2.displayInfo();
    }
}
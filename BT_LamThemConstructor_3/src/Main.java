public class Main {
    public static void main(String[] args) {
        System.out.println("--- SINH VIÊN 1 (Dùng Constructor mặc định & Setter) ---");
        Student sv1 = new Student();
        sv1.setId("SV001");
        sv1.setName("Nguyen Van A");
        sv1.setClassName("66CNTT1");
        sv1.setGpa(8.5);
        sv1.displayInfo();

        System.out.println("\n--- SINH VIÊN 2 (Dùng Constructor có tham số) ---");
        Student sv2 = new Student("SV002", "Tran Thi B", "66CNTT1", 9.2);
        sv2.displayInfo();

        System.out.println("\n--- KIỂM TRA TÍNH ĐÓNG GÓI ---");

        Student sv3 = new Student("SV003", "Le Van C", "66CNTT1", 11.5); 
        sv3.displayInfo();

        sv1.setGpa(-2.0);
        sv1.displayInfo();
    }
}
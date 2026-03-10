
public class Main {

	public static void main(String[] args) {
		System.out.println("--- KHỞI TẠO TÀI KHOẢN ---");
        EmailAccount acc1 = new EmailAccount("user@gmail.com", "MySecretPass", 15.0);
        
      
        EmailAccount acc2 = new EmailAccount("user_gmail_com", "123", -5.0);

        System.out.println("\n--- THÔNG TIN BAN ĐẦU ---");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        System.out.println("\n--- TEST ĐỔI MẬT KHẨU ---");

        acc1.changePassword("WrongPass", "NewPass123");

        acc1.changePassword("MySecretPass", "12345");

        acc1.changePassword("MySecretPass", "NewPass12345");

        System.out.println("\n--- TEST TẢI FILE ---");
        System.out.println(acc1.toString());

        acc1.uploadFile(5.0);
        System.out.println("Sau khi tải 5GB: " + acc1.toString());
        
       
        acc1.uploadFile(12.0);
        

        acc1.uploadFile(10.0);
        System.out.println("Sau khi tải thêm 10GB: " + acc1.toString());
	}

}

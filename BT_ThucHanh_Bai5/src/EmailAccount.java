
public class EmailAccount {
	private String email;
    private String password;
    private double storageLimit; 
    private double usedStorage;  


    public EmailAccount(String email, String password, double storageLimit) {
        
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Cảnh báo: Email không hợp lệ. Gán mặc định: invalid@email.com");
            this.email = "invalid@email.com";
        }


        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Cảnh báo: Mật khẩu quá ngắn. Gán mặc định: default123");
            this.password = "default123";
        }


        if (storageLimit > 0) {
            this.storageLimit = storageLimit;
        } else {
            System.out.println("Cảnh báo: Dung lượng lưu trữ phải > 0. Gán mặc định: 15.0 GB");
            this.storageLimit = 15.0;
        }

        
        this.usedStorage = 0.0;
    }


    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getStorageLimit() { return storageLimit; }
    public void setStorageLimit(double storageLimit) { this.storageLimit = storageLimit; }

    public double getUsedStorage() { return usedStorage; }


    public void changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass)) {
            if (newPass != null && newPass.length() >= 8) {
                this.password = newPass;
                System.out.println("-> Đổi mật khẩu thành công cho tài khoản: " + this.email);
            } else {
                System.out.println("-> Lỗi: Mật khẩu mới phải có ít nhất 8 ký tự!");
            }
        } else {
            System.out.println("-> Lỗi: Mật khẩu cũ không chính xác!");
        }
    }


    public void uploadFile(double sizeGB) {
        if (sizeGB <= 0) {
            System.out.println("-> Lỗi: Kích thước file phải lớn hơn 0.");
            return;
        }
        
        if (this.usedStorage + sizeGB <= this.storageLimit) {
            this.usedStorage += sizeGB;
            System.out.println("-> Tải file lên thành công! Đã thêm " + sizeGB + " GB.");
        } else {
            System.out.println("-> Lỗi: Không đủ dung lượng! Bạn cần thêm " + 
                               ((this.usedStorage + sizeGB) - this.storageLimit) + " GB để tải file này.");
        }
    }


    public double calculateStoragePercentage() {
        return (this.usedStorage / this.storageLimit) * 100;
    }

 
    public String toString() {
        return String.format("Email: %s | Dung lượng: %.2f/%.2f GB (Đã dùng %.1f%%)", 
                              email, usedStorage, storageLimit, calculateStoragePercentage());
    }
}

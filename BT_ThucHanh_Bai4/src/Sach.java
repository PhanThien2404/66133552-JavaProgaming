
public class Sach {
	private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private String trangThai; 

  
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        
      
        int namHienTai = 2026;
        
        
        if (namXuatBan > 1900 && namXuatBan <= namHienTai) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Cảnh báo: Năm xuất bản " + namXuatBan + " không hợp lệ cho sách '" + tenSach + "'. Tự động gán về năm hiện tại (" + namHienTai + ").");
            this.namXuatBan = namHienTai;
        }
        
        
        this.trangThai = "Có sẵn";
    }


    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public String getTrangThai() { return trangThai; }
    public void setTrangThai(String trangThai) { this.trangThai = trangThai; }

  
    
    public void muonSach() {
        if (this.trangThai.equals("Có sẵn")) {
            this.trangThai = "Đang mượn";
            System.out.println("-> Mượn thành công sách: " + this.tenSach);
        } else {
            System.out.println("-> Xin lỗi, sách '" + this.tenSach + "' hiện đang được mượn.");
        }
    }

    public void traSach() {
        if (this.trangThai.equals("Đang mượn")) {
            this.trangThai = "Có sẵn";
            System.out.println("-> Trả thành công sách: " + this.tenSach);
        } else {
            System.out.println("-> Sách '" + this.tenSach + "' vốn đã có sẵn trong thư viện.");
        }
    }

    public boolean kiemTraSachCu() {
        return this.namXuatBan < 2000;
    }

    public String toString() {
        return String.format("Mã: %s | Tên: %s | Tác giả: %s | Năm XB: %d | Trạng thái: %s", 
                              maSach, tenSach, tacGia, namXuatBan, trangThai);
    }
}

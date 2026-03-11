public class Laptop {
    private String brand;
    private String model;
    private double price;

    public Laptop() {
        this.brand = "Chưa cập nhật";
        this.model = "Chưa cập nhật";
        this.price = 0.0;
    }

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.setPrice(price); 
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Lỗi: Giá của " + this.model + " không thể là số âm! Đã tự động gán về 0.0");
            this.price = 0.0;
        }
    }

    public void displayInfo() {
        System.out.println("Laptop [Hãng: " + brand + ", Dòng máy: " + model + ", Giá: $" + price + "]");
    }
}
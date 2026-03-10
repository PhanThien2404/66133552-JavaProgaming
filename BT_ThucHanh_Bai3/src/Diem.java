
public class Diem {
    private double x;
    private double y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
    }

    public boolean kiemTraTrungNhau(Diem d) {
        return (this.x == d.x) && (this.y == d.y);
    }

    public Diem doiXungQuaGoc() {
        return new Diem(-this.x, -this.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

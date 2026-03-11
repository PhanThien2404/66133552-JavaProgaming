public class Student {
    private String id;
    private String name;
    private String className;
    private double gpa;

    public Student() {
        this.id = "Chưa có";
        this.name = "Chưa có";
        this.className = "Chưa có";
        this.gpa = 0.0;
    }

    public Student(String id, String name, String className, double gpa) {
        this.id = id;
        this.name = name;
        this.className = className;

        setGpa(gpa); 
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGpa() {
        return gpa;
    }


    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 10.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Lỗi: Điểm GPA (" + gpa + ") không hợp lệ! Đã gán mặc định về 0.0.");
            this.gpa = 0.0;
        }
    }


    public void displayInfo() {
        System.out.println("Mã SV: " + id + " | Họ tên: " + name + " | Lớp: " + className + " | GPA: " + gpa);
    }
}

public class Main {

	public static void main(String[] args) {
		Ex_Circle_1_1 c1 = new Ex_Circle_1_1();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        
        Ex_Circle_1_1 c2 = new Ex_Circle_1_1(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        
        Ex_Circle_1_1 c3 = new Ex_Circle_1_1(3.5, "blue");
        System.out.println(c3.toString());
	}

}

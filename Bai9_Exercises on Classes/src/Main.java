
public class Main {

	public static void main(String[] args) {
		Ex_Ball_1_9 ball = new Ex_Ball_1_9(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball); 

        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball); 
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);

        ball.reflectVertical();
        ball.move();
        System.out.println(ball);
	}

}

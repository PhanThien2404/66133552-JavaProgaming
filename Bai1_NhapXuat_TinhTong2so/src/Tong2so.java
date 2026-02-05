import java.util.Scanner;
public class Tong2so {

	public static void main(String[] args) {
		
		double num1, num2, sum;
		
		Scanner banPhim = new Scanner(System.in);
	
		System.out.print("Moi nhập số thu nhất: ");
		num1= banPhim.nextDouble();

		System.out.print("Moi nhập số thứ hai: ");
		num2= banPhim.nextDouble();


		sum = num1+num2;
		System.out.print("Tổng của " + num1 + "và " + num2 + "la" + sum);
		System.out.print("Tong của ");
		System.out.print(num1);
		System.out.print("va ");
		System.out.print(num2);
		System.out.print("la");
		System.out.print(sum);
	}

}
package hello;
import java.util.Scanner;

public class 모각코7일차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int x = sc.nextInt();
		System.out.print("두번쨰 숫자를 입력하세요: ");
		int y = sc.nextInt();
		System.out.println("===사칙연산 출력하기===");
		System.out.printf("%d + %d = %d\n", x, y, x+y); 
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y); 
		System.out.printf("%d / %d = %d\n", x, y, x/y); 
		System.out.printf("%d %% %d = %d\n", x, y, x%y);
	}
}

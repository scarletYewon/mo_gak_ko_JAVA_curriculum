package hello;
import java.util.Scanner;

public class 모각코11일차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요:");
		int[] Value = new int[5];
		for(int i = 0;i<5;i++) {
			Value[i] = sc.nextInt();
		}
		System.out.println("======= 입력 완료 ======");
		System.out.println("======= 출력 시작 ======");
		for(int i = 4;i>=0;i--) {
			System.out.println(Value[i]);
		}
		
	}
}

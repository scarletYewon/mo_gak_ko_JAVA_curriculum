package hello;
import java.util.Scanner;

public class 모각코10일차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num1 = sc.nextInt();
		int sum1 = 0;
		for(int i=1;i<=num1;i++) {
			sum1+=i;
		}
		System.out.printf("1부터 %d까지 합은 %d입니다\n",num1,sum1);
		System.out.print("숫자를 입력하세요:");
		int num2 = sc.nextInt();
		int sum2 = 0;
		int a = 1;
		while(a<=num2) {
			sum2+=a;
			a++;
		}
		System.out.printf("1부터 %d까지 합은 %d입니다",num2,sum2);
		
	}
}

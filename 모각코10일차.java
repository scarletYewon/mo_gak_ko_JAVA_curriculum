package hello;
import java.util.Scanner;

public class ����10���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int num1 = sc.nextInt();
		int sum1 = 0;
		for(int i=1;i<=num1;i++) {
			sum1+=i;
		}
		System.out.printf("1���� %d���� ���� %d�Դϴ�\n",num1,sum1);
		System.out.print("���ڸ� �Է��ϼ���:");
		int num2 = sc.nextInt();
		int sum2 = 0;
		int a = 1;
		while(a<=num2) {
			sum2+=a;
			a++;
		}
		System.out.printf("1���� %d���� ���� %d�Դϴ�",num2,sum2);
		
	}
}

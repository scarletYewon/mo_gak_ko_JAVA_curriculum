package hello;
import java.util.Scanner;

public class ����11���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 5���� ����� �����Ͽ� �Է��ϼ���:");
		int[] Value = new int[5];
		for(int i = 0;i<5;i++) {
			Value[i] = sc.nextInt();
		}
		System.out.println("======= �Է� �Ϸ� ======");
		System.out.println("======= ��� ���� ======");
		for(int i = 4;i>=0;i--) {
			System.out.println(Value[i]);
		}
		
	}
}

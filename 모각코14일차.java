package hello;
import java.util.Scanner;


public class ����14���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		while (true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int i = sc.nextInt();
			try {
				System.out.println(value[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~9 ������ ���� �Է��ϼ���.");
				continue;
			}
			System.out.println("���α׷� ����");
			break;
		}
	}
}

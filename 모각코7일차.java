package hello;
import java.util.Scanner;

public class ����7���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		int x = sc.nextInt();
		System.out.print("�ι��� ���ڸ� �Է��ϼ���: ");
		int y = sc.nextInt();
		System.out.println("===��Ģ���� ����ϱ�===");
		System.out.printf("%d + %d = %d\n", x, y, x+y); 
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y); 
		System.out.printf("%d / %d = %d\n", x, y, x/y); 
		System.out.printf("%d %% %d = %d\n", x, y, x%y);
	}
}

package hello;
import java.util.Scanner;

public class ����6���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== �ڱ�Ұ� �Է��ϱ� =========");
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("����:");
		int age = sc.nextInt();
		System.out.print("������:");
		char blood = sc.next().charAt(0);
		System.out.print("MBTI:");
		String mbti = sc.next();
		System.out.print("�¿��:");
		sc.nextLine();
		String motto = sc.nextLine();
		System.out.println("======== �ڱ�Ұ� �Է¿Ϸ� =========\n\n");
		System.out.println("���̿� �׶��� �ڱ�Ұ� ����! => �����Ϸ��� ���͸� ��������");
		sc.nextLine();
		System.out.println("���� " + name + "�Դϴ�. ���̴� " + age + "�̿���");
		System.out.println("�������� " + blood + "�̱���, " + mbti + "�Դϴ�\n");
		System.out.println("�ڡڡ� " + motto + "!!!!!!!!!" + " �ڡڡ�");
	}
}

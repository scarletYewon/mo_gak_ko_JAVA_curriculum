package hello;
import java.util.Scanner;

public class ����9���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ������ MBTI ��� ���� ====");
		System.out.print("����� MBTI�� �Է��ϼ���:");
		String MBTI = sc.nextLine();
		if (MBTI == "INTP") {
			System.out.println("����� ���������Դϴ�!");
		} else if (MBTI.equals("ENFJ")) {
			System.out.println("����� ����Ʈ�������Դϴ�!");
		} else if (MBTI.equals("INFJ")) {
			System.out.println("����� Ǯ�����Դϴ�!");
		} else if (MBTI.equals("ISTJ")) {
			System.out.println("����� �ۺ������Դϴ�!");
		} else if (MBTI.equals("ENTJ")) {
			System.out.println("����� ��Ű�������Դϴ�!");
		} else if (MBTI.equals("ISFJ")) {
			System.out.println("����� �������������Դϴ�!");
		} else if (MBTI.equals("INTJ")) {
			System.out.println("����� �����ͺм������Դϴ�!");
		} else if (MBTI.equals("ENFP")) {
			System.out.println("����� AI���Դϴ�!");
		} else if (MBTI.equals("ENTP")) {
			System.out.println("����� iOS���Դϴ�!");
		} else if (MBTI.equals("ESFJ")) {
			System.out.println("����� �ȵ���̵����Դϴ�!");
		} else if (MBTI.equals("ESFP")) {
			System.out.println("����� ���� ���������Դϴ�!");
		} else if (MBTI.equals("ESTP")) {
			System.out.println("����� IoT ���������Դϴ�!");
		} else if (MBTI.equals("ESTJ")) {
			System.out.println("����� QA���Դϴ�!");
		} else if (MBTI.equals("INFP")) {
			System.out.println("����� ���ü�����Դϴ�!");
		} else if (MBTI.equals("ISTP")) {
			System.out.println("����� �Ӻ���� ���������Դϴ�!");
		} else {
			System.out.println("����� ��Ʈ��ũ ���������Դϴ�!");
		}
	}
}

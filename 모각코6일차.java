package hello;
import java.util.Scanner;

public class 모각코6일차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 자기소개 입력하기 =========");
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("나이:");
		int age = sc.nextInt();
		System.out.print("혈액형:");
		char blood = sc.next().charAt(0);
		System.out.print("MBTI:");
		String mbti = sc.next();
		System.out.print("좌우명:");
		sc.nextLine();
		String motto = sc.nextLine();
		System.out.println("======== 자기소개 입력완료 =========\n\n");
		System.out.println("아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요");
		sc.nextLine();
		System.out.println("저는 " + name + "입니다. 나이는 " + age + "이예요");
		System.out.println("혈액형은 " + blood + "이구요, " + mbti + "입니다\n");
		System.out.println("★★★ " + motto + "!!!!!!!!!" + " ★★★");
	}
}

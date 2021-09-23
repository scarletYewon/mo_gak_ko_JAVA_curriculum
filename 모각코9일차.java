package hello;
import java.util.Scanner;

public class 모각코9일차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 개발자 MBTI 결과 보기 ====");
		System.out.print("당신의 MBTI를 입력하세요:");
		String MBTI = sc.nextLine();
		if (MBTI == "INTP") {
			System.out.println("당신은 벡엔드형입니다!");
		} else if (MBTI.equals("ENFJ")) {
			System.out.println("당신은 프론트엔드형입니다!");
		} else if (MBTI.equals("INFJ")) {
			System.out.println("당신은 풀스택입니다!");
		} else if (MBTI.equals("ISTJ")) {
			System.out.println("당신은 퍼블리셔형입니다!");
		} else if (MBTI.equals("ENTJ")) {
			System.out.println("당신은 아키텍쳐형입니다!");
		} else if (MBTI.equals("ISFJ")) {
			System.out.println("당신은 보안전문가형입니다!");
		} else if (MBTI.equals("INTJ")) {
			System.out.println("당신은 데이터분석가형입니다!");
		} else if (MBTI.equals("ENFP")) {
			System.out.println("당신은 AI형입니다!");
		} else if (MBTI.equals("ENTP")) {
			System.out.println("당신은 iOS형입니다!");
		} else if (MBTI.equals("ESFJ")) {
			System.out.println("당신은 안드로이드형입니다!");
		} else if (MBTI.equals("ESFP")) {
			System.out.println("당신은 게임 개발자형입니다!");
		} else if (MBTI.equals("ESTP")) {
			System.out.println("당신은 IoT 개발자형입니다!");
		} else if (MBTI.equals("ESTJ")) {
			System.out.println("당신은 QA형입니다!");
		} else if (MBTI.equals("INFP")) {
			System.out.println("당신은 블록체인형입니다!");
		} else if (MBTI.equals("ISTP")) {
			System.out.println("당신은 임베디드 개발자형입니다!");
		} else {
			System.out.println("당신은 네트워크 개발자형입니다!");
		}
	}
}

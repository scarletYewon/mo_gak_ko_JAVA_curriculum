package hello;
import java.util.Scanner;

class Student {
	String name;
	int a;
	int b;
	int c;
	Student(String name,int a, int b, int c){
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float getAverage() {
		float avg;
		avg = (float)(a+b+c)/3;
		return avg;
	}
}
public class ����13���� {
	public static void main(String[] args) {
		Student student1 = new Student("�ڹ�", 100, 80, 75);
		Student student2 = new Student("�躯��", 96, 58, 90);
		System.out.printf("%s�� ��� ���� : %f\n", student1.name, student1.getAverage());
		System.out.printf("%s�� ��� ���� : %f\n", student2.name, student2.getAverage());
	}
}

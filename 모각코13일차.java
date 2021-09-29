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
public class ¸ğ°¢ÄÚ13ÀÏÂ÷ {
	public static void main(String[] args) {
		Student student1 = new Student("ÄÚ¹Â", 100, 80, 75);
		Student student2 = new Student("±èº¯¼ö", 96, 58, 90);
		System.out.printf("%sÀÇ Æò±Õ Á¡¼ö : %f\n", student1.name, student1.getAverage());
		System.out.printf("%sÀÇ Æò±Õ Á¡¼ö : %f\n", student2.name, student2.getAverage());
	}
}

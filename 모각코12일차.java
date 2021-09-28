package hello;
import java.util.Scanner;

class Calculator {
	int x;
	int y;
	void printResult() {
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		System.out.printf("%d / %d = %d\n",x,y,x/y);
		System.out.printf("%d * %d = %d",x,y,x*y);
		
	}
}

public class 모각코12일차 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.x = 30;
		calculator.y = 50;
		calculator.printResult();
		
	}
}

package test;

import java.util.Scanner;

import service.CalculateService;



public class Test {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("�������һ������");
		double firstNumber=input.nextDouble();
		System.out.println("�����������");
		String operator=input.next();
		System.out.println("������ڶ�������");
		double secondNumber=input.nextDouble();
		double result=CalculateService.judge(operator.charAt(0)).calculate(firstNumber, operator, secondNumber);
		System.out.println(result);
	}
}

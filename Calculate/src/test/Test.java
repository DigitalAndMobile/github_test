package test;

import java.util.Scanner;

import service.CalculateService;



public class Test {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("请输入第一个数字");
		double firstNumber=input.nextDouble();
		System.out.println("请输入运算符");
		String operator=input.next();
		System.out.println("请输入第二个数字");
		double secondNumber=input.nextDouble();
		double result=CalculateService.judge(operator.charAt(0)).calculate(firstNumber, operator, secondNumber);
		System.out.println(result);
	}
}

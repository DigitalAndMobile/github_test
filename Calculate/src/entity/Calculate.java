package entity;

public abstract class Calculate {
	public double firstNumber;
	public double secondNumber;
	public double result;
	public String operator;
	public Calculate(){}
	public Calculate(double firstNumber, double secondNumber, String operator) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operator = operator;
	}
	public abstract double calculate(double firstNumber,String operator,double secondNumber);
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}

package entity;

public class ChuCalculate extends Calculate{

	public ChuCalculate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate(double firstNumber,String operator,double secondNumber) {
		setFirstNumber(firstNumber);
		setOperator(operator);
		setSecondNumber(secondNumber);
		return result=getFirstNumber()/getSecondNumber();
	}

}

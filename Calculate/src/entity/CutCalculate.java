package entity;

public class CutCalculate extends Calculate{

	@Override
	public double calculate(double firstNumber,String operator,double secondNumber) {
		setFirstNumber(firstNumber);
		setOperator(operator);
		setSecondNumber(secondNumber);
		return result=getFirstNumber()-getSecondNumber();
	}

}

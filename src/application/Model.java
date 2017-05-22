package application;

public class Model {
	public float Calculate(long number1, long number2, String operate){
		switch(operate)
		{
		case "+":
			return (number1+number2);
		case "-":
			return (number1-number2);
		case "*":
			return (number1*number2);
		case "/":
		{
			if(number2==0)
			return 0;
			else
			return (number1/number2);
			}
			default:
			return 0;
		}
		
	}

}

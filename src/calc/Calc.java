package calc;

public class Calc {

	static int calculate(int firstNum, String symBol, int secondNum) {
		int result = firstNum;
		
		if(symBol.equals("+")) {
			result += secondNum;
		}
		else if (symBol.equals("-")) {
			result -= secondNum;
		}
		else if (symBol.equals("*")) {
			result *= secondNum;
		}
		else if (symBol.equals("/")) {
			result /= secondNum;
		}
		else {
			System.out.println("다시 입력하세요.");
		}
		return result;
	}
}

package calc;
import java.io.*;
public class Main {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("계산할 값을 입력하세요.");
		String[] Question = br.readLine().split(" ");
		
		int i = 1;
		int first = Integer.parseInt(Question[0]);
		int result = first;
		while(i<Question.length) {
			result = Calc.calculate(result, Question[i], Integer.parseInt(Question[i+1]));
			i+=2;
		}
		System.out.println(result);
	}
}

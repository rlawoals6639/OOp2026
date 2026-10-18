package object_coding;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int opIndex = 1;
		int simpleLength = 3;
		double result = 0;

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] tokens = input.split(" ");

		for (String token : tokens) {
			System.out.println(token);
		}

		if (simpleLength < tokens.length) {
			opIndex = ((tokens[1].equals("+") || tokens[1].equals("-")) && (tokens[3].equals("*") || (tokens[3].equals("/")))) ? 3 : 1;
		}

		switch(tokens[opIndex]) {
		case "+" -> result = add(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		case "-" -> result = subtract(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		case "*" -> result = multiply(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		case "/" -> result = divide(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		}

		if (simpleLength < tokens.length) {
			if (opIndex == 3) {
				opIndex = 1;
				switch(tokens[opIndex]) {
				case "+" -> result = add(Double.parseDouble(tokens[opIndex - 1]), result);
				case "-" -> result = subtract(Double.parseDouble(tokens[opIndex - 1]), result);
				case "*" -> result = multiply(Double.parseDouble(tokens[opIndex - 1]), result);
				case "/" -> result = divide(Double.parseDouble(tokens[opIndex - 1]), result);
				}
			} else {
				opIndex = 3;
				switch(tokens[opIndex]) {
				case "+" -> result = add(result, Double.parseDouble(tokens[opIndex + 1]));
				case "-" -> result = subtract(result, Double.parseDouble(tokens[opIndex + 1]));
				case "*" -> result = multiply(result, Double.parseDouble(tokens[opIndex + 1]));
				case "/" -> result = divide(result, Double.parseDouble(tokens[opIndex + 1]));
				}
			}
		}
	}

	public static double add(double a, double b) {
		double result;
		result = a + b;

		System.out.printf("%f\n", result);
		return result;
	}

	public static double subtract(double a, double b) {
		double result;
		result = a - b;

		System.out.printf("%f\n", result);
		return result;
	}

	public static double multiply(double a, double b) {
		double result;
		result = a * b;

		System.out.printf("%f\n", result);
		return result;
	}

	public static double divide(double a, double b) {
		double result;
		result = a / b;

		System.out.printf("%f\n", result);
		return result;
	}
}

import java.util.*;

public class WildCardNeedDemo {
	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);

		System.out.println("The max number is " + max(intStack));

		//ArrayList<String>[] list = (ArrayList<String>[])new ArrayList[10]; //get warning message
		int[][] m = new int[3][5];
		System.out.println(m.length + ", " + m[0].length);
	}

	//public static E o1;

	public static double max(Stack<? extends Number> stack) {
		double max = stack.pop().doubleValue();

		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max)
				max = value;
		}

		return max;
	}
}
/*
 * 2019-2020
 * All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	private void main() {
	}

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Neo");
		names.add("Trinity");

		//Error: SpringLambda: Lambda argument missing parentheses.
		names.forEach(n -> System.out.println(n));

		//Error: SpringLambda: Lambda argument has unnecessary parentheses.
		names.forEach((n) -> System.out.println(n));

	}
}

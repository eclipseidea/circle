package circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	private static double d;
	private static double s;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("INPUT NUMBER");
		double r = Double.parseDouble(br.readLine());
		d = 2 * r;
		System.out.println(d);
		s = 2 * (Math.PI * d);
		System.out.println(s);

	}

}

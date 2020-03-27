import java.util.Arrays;
import java.util.Scanner;

public class Anargam {
	public static void main(String[] args) {
		System.out.println("Enter the string 1");
		String num1 = new Scanner(System.in).next();
		System.out.println("Enter the string 2");
		String num2 = new Scanner(System.in).next();
		System.out.println("Anargam?" + isAnargam(num1, num2));
	}

	public static boolean isAnargam(String num3, String num4) {

		char[] num1 = num3.toCharArray();
		char[] num2 = num4.toCharArray();
		Arrays.sort(num1);
		Arrays.sort(num2);
		/*
		 * if (Arrays.equals(num1, num2)) { return true; } return false;
		 */
		if (num1.length == num2.length) {
			for (int i = 0; i < num1.length; i++) {
				if (num1[i] != num2[i]) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

}

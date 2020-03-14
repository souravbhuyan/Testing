package com.cg.iter;

class Lab1Exp4 {

	static boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String args[]) {
		if (checkNumber(32))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}

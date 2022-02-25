package week1.assignments;

public class Calculator {

		/*
		 * Create a class "Calculator" with below methods (a) add(int num1, int num2,int
		 * num3), it should return sum of num1+num2+num3 (b) sub(int num1, int num2), it
		 * should return subtraction of of num1-num2 (c) mul(double num1, double num2),
		 * it should return product of num1 * num2 (d) divide(float num1,float num2), it
		 * should return division of num1 / num2
		 */
		
		public int addition(int num1, int num2, int num3) {
			int sum = num1+num2+num3;
			return sum;
	}
		
		public int subtraction(int num1, int num2) {
			int sub = num1 - num2;
			return sub;
		}
	
		public double multiply(double num1, double num2) {
			double mul = num1 * num2;
			return mul;
		}
		
		public float division(float num1, float num2) {
			float div = num1 / num2;
			return div;
		}
		
		

}

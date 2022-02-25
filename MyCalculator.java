package week1.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int add = obj.addition(20, 40, 40);
		int sub = obj.subtraction(100, 50);
		double mul = obj.multiply(5, 5);
		float div = obj.division(10, 2);
		
		System.out.println("Sum :"  + add);
		System.out.println("Subtraction :"  + sub);
		System.out.println("Multiply :"  + mul);
		System.out.println("Divison :"  + div);
         
	}

}

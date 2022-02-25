package week1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int input =123;
		int sum=0;
		while(input>0)
		{
			int remainder = input % 10;
			
			sum=sum + remainder;
			
			input= input/10;
			
		}
		
		System.out.println("The Sum is :" +sum);

	}

}

package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum=0, secNum=1,range=8,sum;
		System.out.println(firstNum);
		for (int i = 1; i <range; i++) {
			sum=firstNum+secNum;
			System.out.println(secNum);
			firstNum=secNum;
			secNum=sum;
			
		}
		
	}

	
}

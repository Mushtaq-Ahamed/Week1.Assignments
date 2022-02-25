package week1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int n =10;
		boolean flag=false;
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("It is a Prime Number");
		else
			System.out.println("Not a Prime Number");

	}

}

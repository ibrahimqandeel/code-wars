package code.war.run;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"\n\t\t\t\t\t\t ***************** Welcome To Code Wars Challenges Project ***************** \n\n");
		double primeNum = 11;
		boolean isPrime = true;
		double sqrtOfPrimeNum = Math.ceil(Math.sqrt(primeNum));
		for (int i = 2; i <= sqrtOfPrimeNum; i++) {
			if (primeNum != i && (primeNum / i) % 1 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(primeNum + " Is A Prime Number");
		} else {
			System.out.println(primeNum + " Is Not A Prime Number");
		}

	}

}

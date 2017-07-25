import java.util.Scanner;
class PrimeNumbers {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		for(int no = 0; no <= number; no++) {
			int flag = 0;
			for(int i = 2; i <= Math.sqrt(no); i++) {
				if(isDivisibleBy(no, i)) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) 
				System.out.println(no);
		}
	}

	private static boolean isDivisibleBy(int no, int i) {
		return no % i == 0;
	}
}
package c_Next_Prime;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int b = x+1;
		sc.close();
		boolean boo = false;
		while(true) {
			boo = isPrime(b);
			if(boo) {
				break;
			}
			b++;
		}
		System.out.println(b);
	}

	private static boolean isPrime(int b) {
//		if(b%2 == 0) { return false; }
//		double sq = Math.sqrt(b);
//		for(int c=3;c<sq;c+=2) {
//			if(b%c==0) {
//				return false;
//			}
//		}
		for(int c=2;c<b;c++) {
			if(b%c==0) {
				return false;
			}
		}

		return true;
	}
}

package a_500_Yen_Coins;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		if(k*500>=x) {
		     // System.out.println("k:"+k*500+"x:"+x);
			System.out.println("Yes");
		} else {
		     // System.out.println("k:"+k*500+"x:"+x);
			System.out.println("No");
		}
    }
}

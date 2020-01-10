package b_Count_ABC;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 String str = sc.nextLine();
		 String s = sc.nextLine();
		 sc.close();
		 int result = 0;
		 int cnt = 0;
		 while(true) {
		     result = s.indexOf("ABC");
		     if(result==-1) {
		         // System.out.println("in");
		         break;
		     }
		     // System.out.println("cnt:"+cnt);
		     s = s.substring(result+3);
		     // System.out.println("S:"+s);
		     cnt++;
		 }
		 System.out.println(cnt);
	}
}

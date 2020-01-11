package c_Count_Order;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        sc.close();
        int [] seed = getSeed(n);
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        // buildPerm(seed, perm, used, 0);

        String [] p_array = p.split(" ");
        int [] p_int_array = new int[p_array.length];
        for(int i=0;i<p_array.length;i++) {
            p_int_array[i] = Integer.parseInt(p_array[i]);
        }

        String [] q_array = q.split(" ");
        int [] q_int_array = new int[q_array.length];
        for(int i=0;i<q_array.length;i++) {
            q_int_array[i] = Integer.parseInt(q_array[i]);
        }

	}
	@SuppressWarnings("unused")
	private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
	    if (index == seed.length) {
	        procPerm(perm);
	        return;
	    }

	    for (int i = 0; i < seed.length; ++i) {
	        if (used[i]) { continue; }
	        perm[index] = seed[i];
	        used[i] = true;
	        buildPerm(seed, perm, used, index + 1);
	        used[i] = false;
	    }
	}
	private static void procPerm(int[] perm) {
	    System.out.println(Arrays.toString(perm));
	}

	private static int[] getSeed(int i) {
	    int [] array = new int[i];
	    for(int j=0;j<array.length;j++) {
	        array[j] = j+1;
	    }
	    return array;
	}
}

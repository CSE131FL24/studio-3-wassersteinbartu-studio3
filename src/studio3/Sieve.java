package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the maximum number");
		int n = in.nextInt();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		for (int j = 1; j < nums.length; j++) {
			int temp = nums[j];
			if (temp != 0) {
				for (int k = j; k < nums.length; k = k + temp) {
					if (nums[k] != temp) {
						nums[k] = 0;
					}
				}
			}
		}
		
		for (int s = 0; s < nums.length; s++) {
			if (nums[s] != 0) {
				System.out.println(nums[s]);
			}
		}
		

	}

}

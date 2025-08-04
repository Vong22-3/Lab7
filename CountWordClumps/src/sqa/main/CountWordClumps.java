package sqa.main;

public class CountWordClumps {
	
	public static int countClumps(int[] nums) {
/*1*/	if (nums == null || nums.length == 0) {
/*2*/		return 0;
		}
		
/*3*/	int count = 0;
		int prev = nums[0];
		boolean inClump = false;
		
/*4*/	for (int i = 1; i < nums.length; i++) {
/*5*/		if (nums[i] == prev && !inClump) {
/*6*/			inClump = true;
				count += 1;
			}
		
/*7*/		if (nums[i] != prev) {
/*8*/			prev = nums[i];
				inClump = false;
			}
		}
/*9*/		return count;
	}

}

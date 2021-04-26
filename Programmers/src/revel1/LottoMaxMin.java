package revel1;

import java.util.Arrays;

public class LottoMaxMin {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
		System.out.println(Arrays.toString(solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25})));
		System.out.println(Arrays.toString(solution(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35})));
	}
	
	private static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int sameCount = 0;
		int temp = 0;
		for(int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				temp++;
				continue;
			}
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					sameCount++;
				}
			}
		}
		answer[0] = sameCount + temp >= 2 ? 7 - sameCount - temp : 6;
		answer[1] = sameCount >= 2 ? 7 - sameCount : 6;
		return answer;
		
	}
}

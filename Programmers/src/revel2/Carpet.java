package revel2;

import java.util.Arrays;

public class Carpet {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10,2)));
		System.out.println(Arrays.toString(solution(8,1)));
		System.out.println(Arrays.toString(solution(24,24)));
	}
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=3;;i++){
            if((brown+yellow)%i==0){
                if((i-2)*((brown+yellow)/i-2)==yellow){
                    answer[0]=(brown+yellow)/i;
                    answer[1]=i;
                    return answer;
                }
            }
        }
    }
}

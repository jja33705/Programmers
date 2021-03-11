package revel2;

import java.util.Arrays;

public class Lifeboat {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
		System.out.println(solution(new int[] {70, 80, 50}, 100));
	}
	public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        for (int i = people.length - 1, j = 0; i >= j; i--) {
        	if(i == j) {
        		answer++;
        		break;
        	}
        	if (people[i] +  people[j] <= limit) {
        		j++;
        	}
        	answer++;
        }
        return answer;
    }
}

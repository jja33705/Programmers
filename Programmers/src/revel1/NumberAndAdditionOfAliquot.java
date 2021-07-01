package revel1;

public class NumberAndAdditionOfAliquot {

	public static void main(String[] args) {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));

	}
	
	public static int solution(int left, int right) {
		int answer = 0;
        for(; left <= right; left++) {
            int count = 0;
            for(int i = 1; i <= left; i++){
                if(left % i == 0) {
                    count++;
                }
            }
            answer += count%2 == 0 ? +left : -left;                             
        }
        return answer;
	}

}

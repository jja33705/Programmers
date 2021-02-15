package revel2;

public class RepresentationOfNumbers {

	public static void main(String[] args) {
		System.out.println(solution(15));
		System.out.println(solution(7000));
		System.out.println(solution(500));
	}
	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = i; sum < n; j++) {
                sum += j;
            }
            if(sum == n) {
                answer++;
            }
        }
        return answer;
    }
}

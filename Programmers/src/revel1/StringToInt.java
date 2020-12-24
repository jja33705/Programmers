package revel1;

public class StringToInt {

	public static void main(String[] args) {
		System.out.println(solution("-1234"));
		System.out.println(solution("+1234"));
	}
	public static int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}

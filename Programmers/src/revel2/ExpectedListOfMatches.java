package revel2;

public class ExpectedListOfMatches {

	public static void main(String[] args) {
		System.out.println(solution(8,4,7));
	}
	public static int solution(int n, int a, int b)
    {
        int answer = 0;
        while(true){
            answer++;
            if((a+1)/2==(b+1)/2){
                return answer;
            }
            a=(a+1)/2;
            b=(b+1)/2;
        }
    }
}

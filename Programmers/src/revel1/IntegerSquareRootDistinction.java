package revel1;

public class IntegerSquareRootDistinction {

	public static void main(String[] args) {
		System.out.println(solution(144));
		System.out.println(solution(169));
		System.out.println(solution(2341413));
	}
	public static long solution(long n) {
        if(((long)Math.sqrt((double)n))*((long)Math.sqrt((double)n))==n){
            return ((long)Math.sqrt((double)n)+1)*((long)Math.sqrt((double)n)+1);
        }else{
            return -1;
        }
    }
}

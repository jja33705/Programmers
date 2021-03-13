package revel2;

public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(solution(100000));
		System.out.println(solution(55555));
	}
	public static int solution(int n) {
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            if(i % 2 == 0){
                a = a + b;
                if(a>1234567) {
                	a = a - 1234567;
                }
            } else{
                b = a + b;
                if(b>1234567) {
                	b = b - 1234567;
                }
            }
        }
        if(a > b){
            return a % 1234567;
        } else{
            return b % 1234567;
        }
    }
}

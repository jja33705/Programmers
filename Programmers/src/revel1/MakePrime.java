package revel1;

public class MakePrime {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 4}));
		System.out.println(solution(new int[] {1, 2, 7, 6, 4}));
	}
	
	private static int solution(int[] arr) {
		int result = 0;
		int a = 0, b = 1, c = 2;
		while (a <= arr.length-3) {
			int sum = arr[a] + arr[b] + arr[c];
			if (sum % 2 != 0) {
				boolean isPrime = true;
				for (int i = 2; i <= sum/2; i++) {
					if(sum % i == 0) {
						isPrime = false;
					}
				}
				if(isPrime) result++;
			}
			if (c < arr.length - 1) {
				c++;
			} else {
				if(b < arr.length - 2) {
					b++;
					c = b + 1;
				} else {
					a++;
					b = a + 1;
					c = b + 1;
				}
			}
		}
		return result;
	}
}

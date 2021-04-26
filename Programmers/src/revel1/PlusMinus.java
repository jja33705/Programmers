package revel1;

public class PlusMinus {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {4, 7, 12}, new boolean[] {true, false, true}));
		System.out.println(solution(new int[] {1, 2, 3}, new boolean[] {false, true, false}));
	}
	
	private static int solution(int[] intArr, boolean[] booleanArr) {
		int result = 0;
        for(int i = 0; i < intArr.length; i++) {
            result += booleanArr[i] ? intArr[i] : -intArr[i]; 
        }
        return result;
	}
}

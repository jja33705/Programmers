import java.util.*;
public class Divisor {

	public static void main(String[] args) {
		Random random=new Random();
		int[] numbers=new int[random.nextInt(50)+1];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=random.nextInt(100)+1;
		}
		int divisor=random.nextInt(10)+1;
		System.out.println("생성된 숫자: "+Arrays.toString(numbers)+"\ndivisor: "+divisor);
		System.out.println(Arrays.toString(solution(numbers, divisor)));
	}
	public static int[] solution(int[] arr, int divisor) {
		int[] answer= {};
		ArrayList<Integer> numbers=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				numbers.add(arr[i]);
			}
		}
		if(numbers.size()==0) {
			answer=new int[1];
			answer[0]=-1;
		}
		else {
			answer=new int[numbers.size()];
			for(int i=0;i<answer.length;i++) {
				answer[i]=numbers.get(i);
			}
		}
		Arrays.sort(answer);
		return answer;
	}
	
}

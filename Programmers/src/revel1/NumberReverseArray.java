package revel1;
import java.util.*;

public class NumberReverseArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(54825)));
	}
	public static int[] solution(long n) {
        int[] answer = {};
        while(n!=0){
            answer=Arrays.copyOf(answer,answer.length+1);
            answer[answer.length-1]=(int)(n%10);
            n/=10;
        }
        return answer;
    }
}

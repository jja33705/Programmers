package revel2;

import java.util.Arrays;

public class FunctionDevelopment {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {95, 90, 99, 99, 80, 99},new int[] {1, 1, 1, 1, 1, 1})));
		System.out.println(Arrays.toString(solution(new int[] {93, 30, 55},new int[] {1, 30, 5})));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        for(int i=0;i<progresses.length;){
            for(int j=0;j<progresses.length;j++){
                progresses[j]+=speeds[j];
            }
            if(progresses[i]>=100){
                int sum=0;
                for(int j=i;j<progresses.length;j++){
                    if(progresses[j]>=100){
                        sum++;
                    }else{
                        break;
                    }
                }
                i+=sum;
                answer=Arrays.copyOf(answer,answer.length+1);
                answer[answer.length-1]=sum;
            }
            
        }
        return answer;
    }
}

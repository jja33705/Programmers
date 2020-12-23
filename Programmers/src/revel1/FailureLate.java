package revel1;

import java.util.Arrays;

public class FailureLate {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {2,1,2,6,2,4,3,3})));
		System.out.println(Arrays.toString(solution(4, new int[] {4,4,4,4,4})));
	}
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageMan=new int[N+1];
        double[] failLate=new double[N]; 
        for(int i=0;i<stages.length;i++){
            stageMan[stages[i]-1]++;
        }
        for(int i=0;i<failLate.length;i++){
            int sum=0;
            for(int j=i;j<stageMan.length;j++){
                sum+=stageMan[j];
            }
            if(sum!=0){
                failLate[i]=(double)stageMan[i]/sum;
            }
        }
        for(int i=0;i<answer.length;i++){
            int max=1;
            for(int j=0;j<failLate.length;j++){
                if(failLate[j]>failLate[max-1]){
                    max=j+1;
                }
            }
            answer[i]=max;
            failLate[max-1]=-10;
        }
        return answer;
    }
}

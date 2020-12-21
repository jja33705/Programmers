package revel2;
import java.util.*;
public class GetPhoneketmon {

	public static void main(String[] args) {
		int[] nums= {3,1,2,3};
		System.out.println(solution(nums));

	}
	public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr=new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){
            boolean isSame=false;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==nums[i]){
                    isSame=true;
                    break;
                }
            }
            if(isSame==false){
                arr.add(nums[i]);
                answer++;
            }
            if(answer==nums.length/2){
                break;
            }
        }
        return answer;
    }
}

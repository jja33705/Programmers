package revel1;
import java.util.*;
public class ReverseThreeNumber {

	public static void main(String[] args) {
		System.out.println(solution(45));
		System.out.println(solution(125));
	}
	public static int solution(int n) {
		int answer = 0;
	    ArrayList<Integer> nums=new ArrayList<>();
	    while(n!=0) {
	    	nums.add(n%3);
	    	n=n/3;
	    }
	    for(int i=0;i<=nums.size()-1;i++) {
	    	int temp=nums.get(i);
	    	for(int j=nums.size()-1-i;j>0;j--) {
	    		temp=temp*3;
	    	}
	    	answer+=temp;
	    }
	    return answer;
	}
}

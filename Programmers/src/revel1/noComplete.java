package revel1;
import java.util.*;
public class noComplete {

	public static void main(String[] args) {
		String[] participant= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion= {"josipa", "filipa","marina", "nikola"};
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length-1];
        for(int i=0;i<completion.length;i++){
            if(participant[i].equals(completion[i])==false){
                answer=participant[i];
                break;
            }
        }
        return answer;
    }
}

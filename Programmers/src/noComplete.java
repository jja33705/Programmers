import java.util.*;
public class noComplete {

	public static void main(String[] args) {
		String[] participant= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion= {"josipa", "filipa","marina", "nikola"};
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<participant.length;i++){
            if(i==participant.length-1){
                answer=participant[participant.length-1];
                break;
            }
            if(participant[i].equals(completion[i])==false){
                answer=participant[i];
                break;
            }
        }
        return answer;
    }
}

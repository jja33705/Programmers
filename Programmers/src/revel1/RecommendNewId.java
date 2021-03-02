package revel1;

public class RecommendNewId {

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("abcdefghijklmn.p"));

	}
	public static String solution(String new_id) {
	    String answer = new_id.toLowerCase();
	    for(int i = 0; i < answer.length();) {
	    	if((answer.charAt(i) < 'a' || answer.charAt(i) > 'z') && (answer.charAt(i) < '0' || answer.charAt(i) > '9') && answer.charAt(i) != '-' && answer.charAt(i) != '_' && answer.charAt(i) != '.')
	    		answer = answer.substring(0, i).concat(answer.substring(i+1, answer.length()));
	    	else
	    		i++;
	    }
	    for(int i = 0; i < answer.length()-1;) {
	    	if(answer.charAt(i) == '.' && answer.charAt(i+1) == '.')
	    		answer = answer.substring(0, i).concat(answer.substring(i+1, answer.length()));
	    	else
	    		i++;
	    }
	    if(answer.charAt(0) == '.')
	    	answer = answer.substring(1);
	    if(answer.length() >= 2 && answer.charAt(answer.length()-1) == '.')
	    	answer = answer.substring(0, answer.length()-1);
	    if(answer.length() == 0) {
	    	answer += "a";
	    }
	    if(answer.length()>=16) {
	    	answer = answer.substring(0, 15);
	    }
	    if(answer.length() >=2 && answer.charAt(answer.length()-1) == '.')
	    	answer = answer.substring(0, answer.length()-1);
	    if(answer.length()<=2) {
	    	while(answer.length() != 3) {
	    		answer += answer.charAt(answer.length()-1);
	    	}
	    }
	    return answer;
	}
}

package revel1;
public class HandleStringBase {
	
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
	public static boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4||s.length()==6){
            answer=true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                return false;
            }
        }
        return answer;
    }
}

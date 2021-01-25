package revel2;

public class MakeJadenCaseString {

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
	}
	public static String solution(String s) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                String word=s.substring(answer.length(),answer.length()+1).toUpperCase();
                word+=s.substring(answer.length()+1,i+1).toLowerCase();
                answer+=word;
            }
        }
        return answer;
    }
}

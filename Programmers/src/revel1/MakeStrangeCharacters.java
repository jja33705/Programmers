package revel1;

public class MakeStrangeCharacters {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
		System.out.println(solution("Merry Christmas!!"));
	}
	public static String solution(String s) {
        int count=0;
        String answer="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
            	answer+=" ";
                count=0;
            }
            else{
            	if(count%2==0) {
            		answer+=s.substring(i,i+1).toUpperCase().charAt(0);
            	}
            	else {
            		answer+=s.substring(i,i+1).toLowerCase().charAt(0);
            	}
            	count++;
            }
        }
        return answer;
    }
}

package revel1;

public class CaesarCipher {

	public static void main(String[] args) {
		System.out.println(solution("DSFviodGnvi",9));
	}
	public static String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer+=' ';
                continue;
            }
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                if((char)(s.charAt(i)+n)<='z'){
                    answer+=(char)(s.charAt(i)+n);
                }
                else{
                    answer+=(char)(s.charAt(i)-('z'-'a')+n-1);
                }
            }else{
                if((char)(s.charAt(i)+n)<='Z'){
                    answer+=(char)(s.charAt(i)+n);
                }
                else{
                    answer+=(char)(s.charAt(i)-('Z'-'A')+n-1);
                }
            }
        }
        return answer;
    }

}

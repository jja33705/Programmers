package revel1;
import java.util.Arrays;

public class StringDescendingOrder {

	public static void main(String[] args) {
		String a="Zbcdefg";
		System.out.println(solution(a));
	}
	public static String solution(String s) {
		String answer = "";
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--) {
        	answer+=arr[i];
        }
        return answer;
    }
}

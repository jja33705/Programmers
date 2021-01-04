package revel1;
import java.util.*;

public class DescendingOrderNumber {

	public static void main(String[] args) {
		long num=846574564;
		System.out.println(solution(num));
	}
	public static long solution(long n) {
        String str="";
        str+=n;
        char[] arr=new char[str.length()]; 
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        Arrays.sort(arr);
        str="";
        for(int i=arr.length-1;i>=0;i--){
            str+=arr[i];
        }
        long answer = Long.parseLong(str);
        return answer;
    }
}

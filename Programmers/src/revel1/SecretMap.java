package revel1;

import java.util.Arrays;

public class SecretMap {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})));
		System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})));
	}
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            answer[i]="";
            String binary1, binary2;
            binary1=Integer.toBinaryString(arr1[i]);
            while(binary1.length()!=n){
                binary1=" "+binary1;
            }
            binary2=Integer.toBinaryString(arr2[i]);
            while(binary2.length()!=n){
                binary2=" "+binary2;
            }
            for(int j=0;j<n;j++){
                if(binary1.charAt(j)=='1'||binary2.charAt(j)=='1'){
                    answer[i]+='#';
                }else{
                    answer[i]+=' ';
                }
            }
        }
        return answer;
    }
}

import java.util.*;
public class dartGame {

	public static void main(String[] args) {
		String dartResult="1D2S#10S";
		System.out.println(solution(dartResult));
	}
	public static int solution(String dartResult) {
        int[] point=new int[dartResult.length()/2];
        for(int i=0,pointIndex=0;i<dartResult.length();i++){
            if(dartResult.charAt(i)-48>=0&&dartResult.charAt(i)-48<=10){
            	if(dartResult.charAt(i)-48==1&&dartResult.charAt(i+1)-48==0) {
            		point[pointIndex]=10;
                    pointIndex++;
                    i++;
            	}
            	else {
            		point[pointIndex]=dartResult.charAt(i)-48;
                    pointIndex++;
            	}
            }
            else if(dartResult.charAt(i)=='S'||dartResult.charAt(i)=='D'||dartResult.charAt(i)=='T') {
            	switch(dartResult.charAt(i)) {
            	case 'D':
            		point[pointIndex-1]=point[pointIndex-1]*point[pointIndex-1];
            		break;
            	case 'T':
            		point[pointIndex-1]=point[pointIndex-1]*point[pointIndex-1]*point[pointIndex-1];
            		break;
            	}
            }
            else{
            	switch(dartResult.charAt(i)) {
            	case '*':
            		if(pointIndex==1) {
            			point[pointIndex-1]=2*point[pointIndex-1];
            		}
            		else {
            			point[pointIndex-1]=2*point[pointIndex-1];
            			point[pointIndex-2]=2*point[pointIndex-2];
            		}
            		break;
            	case '#':
            		point[pointIndex-1]=point[pointIndex-1]*-1;
            		break;
            	}
            }
        }
        int answer = 0;
        for(int n:point) {
        	answer+=n;
        }
        return answer;
	}
}

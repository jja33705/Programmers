package revel2;
import java.util.*;

public class Printer {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {6,3,6,7,3,2,5,8,8,2,3,5,6,8,3,3},9));
	}
	public static int solution(int[] priorities, int location) {
        int count=0;
        while(true){
            boolean isMax=true;
            for(int i=1;i<priorities.length;i++){
                if(priorities[0]<priorities[i]){
                    isMax=false;
                    break;
                }
            }
            if(isMax){
                count++;
                if(location==0){
                    return count;
                }else{
                    priorities=Arrays.copyOfRange(priorities, 1, priorities.length);
                    location--;
                }
            }else{
                int temp=priorities[0];
                for(int i=0;i<priorities.length-1;i++){
                    priorities[i]=priorities[i+1];
                }
                priorities[priorities.length-1]=temp;
                if(location==0){
                    location=priorities.length-1;
                }else{
                    location--;
                }
            }
        }
    }
}

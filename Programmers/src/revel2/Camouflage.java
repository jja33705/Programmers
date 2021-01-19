package revel2;

import java.util.ArrayList;

public class Camouflage {

	public static void main(String[] args) {
		String[][] clothes={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
		String clothes2[][]={{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		System.out.println(solution(clothes2));
	}
	public static int solution(String[][] clothes) {
        int answer = 1;
        ArrayList<String> kind=new ArrayList<String>();
        ArrayList<Integer> count=new ArrayList<Integer>();
        for(int i=0;i<clothes.length;i++) {
        	boolean exist=false;
        	for(int j=0;j<kind.size();j++) {
        		if(clothes[i][1].equals(kind.get(j))){
        			exist=true;
        			count.set(j, count.get(j)+1);
        		}
        	}
        	if(exist==false) {
        		kind.add(clothes[i][1]);
        		count.add(2);
        	}
        }
        for(int i=0;i<count.size();i++) {
        	answer=answer*count.get(i);
        }
        return answer-1;
    }

}

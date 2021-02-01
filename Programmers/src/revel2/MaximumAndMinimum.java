package revel2;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));

	}
	public static String solution(String s) {
		ArrayList<Integer> list=new ArrayList<>();
		int idx=0;
		for(int i=0;i<s.length();i++) {
			if(i==s.length()-1 || s.charAt(i+1)==' ' ) {
				list.add(Integer.parseInt(s.substring(idx, i+1)));
				idx=i+2;
			}
		}
		Collections.sort(list);
		return list.get(0)+" "+list.get(list.size()-1);
	}
}

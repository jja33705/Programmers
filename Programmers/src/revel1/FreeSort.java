package revel1;
import java.util.*;
public class FreeSort {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"sun","bed","car"},1)));
		System.out.println(Arrays.toString(solution(new String[] {"abce","abcd","cdx"},2)));
	}
	public static String[] solution(String[] strings, int n) {
        for(int i=0;i<strings.length-1;i++) {
        	int min=i;
        	for(int j=i+1;j<strings.length;j++) {
        		if(strings[min].charAt(n)>=strings[j].charAt(n)) {
        			if(strings[min].charAt(n)==strings[j].charAt(n)) {
        				if(strings[j].compareTo(strings[min])<0){
                            min=j;
                        }
        			}
        			else {
        				min=j;
        			}
        		}
        	}
        	if(min!=i) {
        		String temp=strings[i];
        		strings[i]=strings[min];
        		strings[min]=temp;
        	}
        }
        return strings;
    }
}

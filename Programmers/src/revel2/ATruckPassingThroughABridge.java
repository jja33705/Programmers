package revel2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ATruckPassingThroughABridge {
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[] {7, 4, 5, 6}));
		System.out.println(solution(100, 100, new int[] {10}));
		System.out.println(solution(100, 100, new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        while(true) {
        	if(queue.size() == bridge_length) {
        		if(queue.poll() != 0) {
        			if(count == truck_weights.length) {
        				Iterator<Integer> iterator = queue.iterator();
        				boolean end = true;
        				while(iterator.hasNext()) {
        					if(iterator.next() != 0) {
        						end = false;
        					}
        				}
        				if(end) {
        					return answer;
        				}
        			}
        		}
        	}
        	Iterator<Integer> iterator = queue.iterator();
        	int sum = 0;
        	while(iterator.hasNext()) {
        		sum += iterator.next();
        	}
        	if (count < truck_weights.length && sum + truck_weights[count] <= weight) {
        		queue.offer(truck_weights[count++]);
        	} else {
        		queue.offer(0);
        	}
        	answer++;
        }
    }
}
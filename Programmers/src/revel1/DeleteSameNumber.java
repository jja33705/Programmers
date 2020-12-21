package revel1;
import java.util.*;
public class DeleteSameNumber {

	public static void main(String[] args) {
		Random random=new Random();
		int size=random.nextInt(10000)+1;
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=random.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		delete(arr);
	}
	static int[] delete(int[] arr) {
		int priviousNumber=arr[0];
		int size=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=priviousNumber) {
				size++;
				priviousNumber=arr[i];
			}
		}
		priviousNumber=arr[0];
		int[] answer=new int[size];
		answer[0]=arr[0];
		for(int i=1,j=1;i<arr.length;i++) {
			if(arr[i]!=priviousNumber) {
				answer[j]=arr[i];
				priviousNumber=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

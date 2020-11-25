import java.util.*;
public class GggGcd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		System.out.println(Arrays.toString(getGggGcd(n1,n2)));
	}
	public static int[] getGggGcd(int n, int m) {
		int temp=0;
        if(m>n){
            temp=n;
            n=m;
            m=temp;
        }
        int multiple=m*n;
        while(m!=0){
            temp=n%m;
            n=m;
            m=temp;
        }
        int[] answer = new int[2];
        answer[0]=n;
        answer[1]=multiple/n;
        return answer;
	}
}

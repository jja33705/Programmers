package revel1;

public class CollatzGuess {

	public static void main(String[] args) {
		System.out.println(solution(125));
		System.out.println(solution(1000));
	}
	public static int solution(int num) {
        int count=0;
        long temp=num;
        while(temp!=1){
            if(count==500){
                return -1;
            }
            if(temp%2==0){
                temp=temp/2;
                count++;
                continue;
            }
            else{
                temp=temp*3+1;
                count++;
            }
        }
        return count;
    }
}

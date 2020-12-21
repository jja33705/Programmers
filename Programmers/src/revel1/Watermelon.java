package revel1;
import java.util.*;
public class Watermelon {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(watermelon(n));
	}
	public static String watermelon(int n) {
		String answer="";
        for(int i=0;i<n;i++){
            if(i%2==0){
                answer+="¼ö";
            }
            else{
                answer+="¹Ú";
            }
        }
        return answer;
	}

}

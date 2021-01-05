package revel2;

public class PhoneNumberList {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"119", "97674223", "1195524421"}));
		System.out.println(solution(new String[] {"12","123","1235","567","88"}));
	}
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length;i++){
            for(int j=0;j<phone_book.length;j++){
                if(j==i){
                    continue;
                }
                if(phone_book[i].startsWith(phone_book[j])){
                    return false;
                }
            }
        }
        return answer;
    }
}

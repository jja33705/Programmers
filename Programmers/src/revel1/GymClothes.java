package revel1;
public class GymClothes {

	public static void main(String[] args) {
		int n=5;
		int[] lost= {2,4};
		int[] reserve= {1,3,5};
		System.out.println(solution(n,lost,reserve));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=0;i<lost.length;i++){
            arr[lost[i]-1]--;
        }
        for(int i=0;i<reserve.length;i++){
            arr[reserve[i]-1]++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(i==0){
                    if(arr[i+1]>1){
                        arr[i]++;
                        arr[i+1]--;
                    }
                }
                else if(i==n-1){
                    if(arr[i-1]>1){
                        arr[i]++;
                        arr[i-1]--;
                    }
                }
                else{
                    if(arr[i-1]>1){
                        arr[i]++;
                        arr[i-1]--;
                    }
                    else if(arr[i+1]>1){
                        arr[i]++;
                        arr[i+1]--;
                    }
                }
            }
        }
        int answer = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                answer++;
            }
        }
        return answer;
    }

}

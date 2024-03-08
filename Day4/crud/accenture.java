import java.util.*;
class accenture{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]={5,4,2,3,9,1,7};
		int sum = 9;
		for (int i=arr.length-1;i>0;i--){
			for(int j = 0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j]= temp;
				}
			}
		}
		int ans = arr[0]+arr[1];
		if(ans <sum){
		System.out.println(arr[0]*arr[1]); 
	}
	}
}
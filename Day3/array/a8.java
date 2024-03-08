import java.util.*;
class a8{
	public static void main(String[] args) {
		String arr[] = {"Ramesh","Ramesh","Rash","Rash"};
		for (int i = 0;i <arr.length;i++){
			for (int j =i+1;j<arr.length;j++){
				if(arr[i].equals(arr[j])){
					System.out.println("Duplicate ="+ arr[j]);
				}
			}
		}
	}
}
import java.util.*;
class capgemini{
	public static void main(String[] args) {
		int sub[]= new int[10];
		Scanner sc = new Scanner(System.in);
		int marks[]= new int[100];
		int max[]=new int[10];
		int mm,i,j;
		System.out.println("Enter no of semester:");
		int n =sc.nextInt();
		for(i=0;i<n;i++){
			System.out.println("Enter no of subjects in "+(i+1)+" Semester:");
			sub[i]= sc.nextInt();
		}
		for(i = 0;i<n;i++){
			System.out.println("Enter marks obtained in Sem "+(i+1));
			for (j=0;j<sub[i];j++){
				marks[j]=sc.nextInt();
			}
			mm = marks[0];
			for(int m =0;m<=j;m++){
				if(mm<=marks[m]){
					mm = marks[m];
				}
				else{

				}
			}
			max[i]=mm;
		j=0;
		}
		for(i = 0;i<n;i++){
			System.out.println("Max Marks in Sem "+(i+1)+ " is "+max[i]);

	}}
}
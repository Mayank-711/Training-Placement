import java.util.Scanner;

public class shambu {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of digits :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(" output :");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+"-"+(char)(arr[j])+" ");
        }
}
}
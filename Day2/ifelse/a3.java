import java.util.*;
class a3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day:");
		String day = sc.next();
		if(day.equals("sunday") | day.equals("saturday")) System.out.println("Weekend");
		else System.out.println("Weekday");
	}
}
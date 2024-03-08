import java.util.*;
class Student{
	int sid[] = new int[10];
	String name[]= new String[10];
	String city[]= new String[10];
	String no[]= new String[10];
	Scanner sc = new Scanner(System.in);
	int i,f,a;
	public void input(){
		System.out.println("Enter sid:");
		sid[i]= sc.nextInt();
		System.out.println("Enter Name:");
		name[i]= sc.next();
		System.out.println("Enter City:");
		city[i]= sc.next();
		System.out.println("Enter Phone no:");
		no[i]= sc.next();
		++i;
	}
	public void display(){
		System.out.println("Studentid\tStudentname\tStudentcity\tSNumber");
		System.out.println("--------------------------------------------");
		for(int j=0;j<i;j++){
			System.out.println(sid[j]+"\t"+name[j]+"\t     "+city[j]+"\t     "+no[j]);
		}
		System.out.println("---------------------------------------------");
	}
	public void update(){
		System.out.println("Enter sid:");
		a = sc.nextInt();
		for(int k=0;k<i;k++){
			if(sid[k]==a){
				System.out.println("ID ="+sid[k]);
				System.out.println("---------------------------");
				System.out.println("1.Name ="+name[k]);
				System.out.println("2.City ="+city[k]);
				System.out.println("3.Phone no ="+no[k]);
				int ch = sc.nextInt();
				switch (ch) {
					case 1:
				System.out.println("Enter new Name:");
				name[k]= sc.next();
				break;
			    case 2:
				System.out.println("Enter new City:");
				city[k]= sc.next();
				break;
				case 3:
				System.out.println("Enter new Phone no:");
				no[k]= sc.next();
				}
				
			}
			else {

			}
		}

	}
	public void delete(){
		System.out.println("Enter sid:");
		a = sc.nextInt();
		for(int k=0;k<i;k++){
			if(sid[k]==a){
				System.out.println("ID ="+sid[k]);
				System.out.println("---------------------------");
				System.out.println("Name ="+name[k]);
				System.out.println("City ="+city[k]);
				System.out.println("Phone no ="+no[k]);
				int d;
				for(d = k;d<=i-1;d++){
					sid[d]=sid[d+1];
					name[d]=name[d+1];
					city[d]=city[d+1];
					no[d]=no[d+1];
				}
				System.out.println("Deleted");
				System.out.println("---------------------------");
			}

	}--i;
}
class c1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		while(true){
		System.out.println("1.Input Data");
		System.out.println("2.Display Data");
		System.out.println("3.Update Data");
		System.out.println("4.Delete Data");
		System.out.println("5.Exit");
		int n = sc.nextInt();
		switch(n){
		case 1: s.input();
			break;
		case 2: s.display();
			break;
		case 3: s.update();
			break;
		case 4: s.delete();
			break;
		case 5: System.exit(0);
		}

	}
	}
}}
package Bai1;

public class RunMain {
	public static void main(String[] args) {
		
		Person ps1 = new Person();
		Person ps2 = new Person("Nguyen Van A", 18, "Nam", "Di choi");
		
		System.out.println(ps2);
		System.out.println(ps2.toString());
		
		ps1.setName("Nguyen Van A");
		ps1.setAge(19);
		ps1.setGender("Nam");
		ps1.setHobby("Nghe nhac");
		
		System.out.println("Name:   " + ps1.getName());
		System.out.println("Age:    " + ps1.getAge());
		System.out.println("Gender: " + ps1.getGender());
		System.out.println("Hobby:  " + ps1.getHobby());
		
	}
}

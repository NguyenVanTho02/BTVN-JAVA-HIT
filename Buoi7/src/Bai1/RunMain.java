package Bai1;

public class RunMain {
	public static void main(String[] args) {
		Employee person1 = new Employee("Trung", "Ha Noi", 3600);
		Customer person2 = new Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();
	}
}

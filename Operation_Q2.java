package lab;

public class Operation_Q2 {
	public static void main(String[] args) {
		System.out.println("\nThis conversation between teacher and students ");

		Student_Q2 std = new Student_Q2();
		Teacher_Q2 tech = new Teacher_Q2();
		tech.speak();
		std.speak();
	}
}

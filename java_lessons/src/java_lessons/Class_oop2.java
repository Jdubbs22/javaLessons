package java_lessons;

public class Class_oop2 {

	public static void main(String[] args) {
		Class_oop John = new Class_oop();
		John.name = "John"; // name is public so I can set it's value
		// System.out.println(John.attack); // cannot do because it's private
		System.out.println(John.name + " has an attack of " + John.getAttack());
		// can only access private outside a class if there are accesser
		// functions

	}// end main

}// end Class_oop2

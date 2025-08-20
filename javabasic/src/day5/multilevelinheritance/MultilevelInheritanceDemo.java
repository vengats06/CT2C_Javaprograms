package day5.multilevelinheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Person p1 = new Person("puvi", 999999999, new Date(2005, 12, 2));
		System.out.println(p1);

		p1 = new Employee("gokul", 8080807070l, new Date(1965, 05, 07), "vespa", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhur", 9880807227l, new Date(1990, 15, 05), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);
	}

}

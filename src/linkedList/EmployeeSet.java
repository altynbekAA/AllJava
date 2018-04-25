package linkedList;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {
public static void main(String[] args) {
	
	Set<Employee> employee = new HashSet<>();
	employee.add(new Employee(223,"Shaun"));
	employee.add(new Employee(124,"Patel"));
	employee.add(new Employee(124,"Patel"));

	System.out.println(employee);
	

	
}
}









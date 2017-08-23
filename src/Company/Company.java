package Company;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Company {

	private String name;
	// private Map<String branch , TreeSet<Employee>> branches;
	private Map<String, TreeSet<Employee>> branches;

	public Company(String name) {

		this.setName(name);
		this.branches = new TreeMap<String, TreeSet<Employee>>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0 && !(name.equals(null))) {
			this.name = name;
		}
	}

	public void addEmployee(Employee emp, String branch) {
		this.branches.get(branch).add(emp);
	}

	public Map<String, TreeSet<Employee>> getBranches() {
		return branches;
	}

	public void addBranch(String branch, String typeOfSorting) {
		if (typeOfSorting.equals("age")) {
			this.branches.put(branch, new TreeSet<Employee>(new CompareEmploeeByAge()));
		}
		if (typeOfSorting.equals("name")) {
			this.branches.put(branch, new TreeSet<Employee>(new CompareEmploeeByName()));
		} else {
			this.branches.put(branch, new TreeSet<Employee>(new CompareEmployeeBySalary()));
		}
	}

	public void listAllByBranches() {
		for (String entry : branches.keySet()) {
			System.out.println(entry);

			for (Employee emp : branches.get(entry)) {
				System.out.println(emp.toString());
			}
		}
	}

	public void listAllEmployees(Map<String, TreeSet<Employee>> branches) {
		TreeSet<Employee> tempEmployees = new TreeSet<Employee>(new CompareEmploeeByName());
		for (String entry : branches.keySet()) {
			for (Employee emp : branches.get(entry)) {
				tempEmployees.add(emp);
			}
		}
		for (Employee e : tempEmployees) {
			System.out.println(e.toString());
		}

	}

	public void eliminateTheDuplicates(Map<String, TreeSet<Employee>> branches) {
		HashSet<Employee> tempEmployees = new HashSet<Employee>();
		for (String entry : branches.keySet()) {
			for (Employee emp : branches.get(entry)) {
				if (!(branches.entrySet().contains(emp))) {
					tempEmployees.add(emp);
				}
			}
		}
		for (Employee e : tempEmployees) {
			System.out.println(e.toString());
		}

	}

}
